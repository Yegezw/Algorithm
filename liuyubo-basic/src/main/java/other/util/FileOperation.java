package other.util;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 * 文件相关操作
 */
public class FileOperation {

    private FileOperation() {
    }

    /**
     * 读取文件名称为 filename 中的内容, 并将其中包含的所有词语转为 String
     */
    public static String readFile(String filename) {
        ArrayList<String> list = new ArrayList<>();
        if (readFile(filename, list)) {
            StringBuilder sb = new StringBuilder();
            for (String word : list) sb.append(word).append(" ");
            return sb.toString();
        }
        throw new RuntimeException("Error in reading " + filename);
    }

    /**
     * 读取文件名称为 filename 中的内容, 并将其中包含的所有词语放进 words 中
     */
    public static boolean readFile(String filename, ArrayList<String> words) {
        if (filename == null || words == null) {
            System.out.println("filename is null or words is null");
            return false;
        }

        // 文件读取
        Scanner scanner;

        try {
            File file = new File(filename);
            if (file.exists()) {
                FileInputStream fis = new FileInputStream(file);
                scanner = new Scanner(new BufferedInputStream(fis), StandardCharsets.UTF_8);
                scanner.useLocale(Locale.ENGLISH);
            } else {
                return false;
            }
        } catch (IOException ioe) {
            System.out.println("Cannot open " + filename);
            return false;
        }

        // 简单分词
        // 这个分词方式相对简陋, 没有考虑很多文本处理中的特殊问题
        // 在这里只做 demo 展示用
        if (scanner.hasNextLine()) {
            String contents = scanner.useDelimiter("\\A").next();
            int start = firstCharacterIndex(contents, 0);

            for (int i = start + 1; i <= contents.length(); ) {
                if (i == contents.length() || !Character.isLetter(contents.charAt(i))) {
                    String word = contents.substring(start, i).toLowerCase();
                    words.add(word);
                    start = firstCharacterIndex(contents, i);
                    i = start + 1;
                } else {
                    i++;
                }
            }
        }

        return true;
    }

    /**
     * 寻找字符串 s 中, 从 start 的位置开始的第一个字母字符的位置
     */
    private static int firstCharacterIndex(String s, int start) {
        for (int i = start; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                return i;
            }
        }
        return s.length();
    }
}