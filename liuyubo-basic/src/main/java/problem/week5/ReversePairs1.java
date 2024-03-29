package problem.week5;

/**
 * <a href="https://leetcode-cn.com/problems/shu-zu-zhong-de-ni-xu-dui-lcof/">剑指 Offer 51 - 数组中的逆序对</a>
 */
@SuppressWarnings("all")
public class ReversePairs1 {

    /**
     * 暴力解法
     */
    public static int reversePairs(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        // 245357
        int[] nums = {17, 7, 2, 7, 19, 12, 2, 25, 12, 9, 9, 15, 20, 5, 3, 15, 3, 15, 2, 10, 9, 17, 18, 4, 10, 16, 11, 17, 13, 13, 7, 24, 4, 15, 12, 14, 21, 13, 24, 23, 9, 7, 10, 17, 18, 4, 23, 17, 25, 16, 21, 14, 22, 9, 3, 23, 22, 22, 4, 17, 0, 6, 22, 24, 1, 1, 1, 15, 0, 3, 3, 13, 22, 11, 17, 0, 14, 4, 6, 20, 13, 24, 19, 1, 19, 14, 14, 16, 21, 23, 8, 23, 24, 5, 1, 11, 21, 17, 9, 7, 17, 19, 18, 1, 3, 2, 20, 22, 11, 7, 21, 1, 6, 18, 9, 1, 9, 23, 1, 12, 12, 22, 2, 10, 9, 16, 16, 5, 18, 7, 15, 23, 23, 9, 13, 13, 23, 6, 22, 20, 19, 25, 13, 14, 17, 19, 13, 9, 16, 11, 0, 14, 16, 18, 24, 16, 20, 10, 3, 7, 20, 22, 10, 9, 10, 19, 16, 16, 24, 2, 20, 7, 23, 20, 3, 13, 22, 13, 6, 21, 9, 15, 6, 15, 18, 14, 12, 16, 0, 17, 6, 9, 1, 10, 25, 14, 5, 16, 14, 22, 23, 13, 5, 1, 1, 6, 0, 6, 24, 22, 17, 21, 25, 21, 16, 17, 4, 1, 10, 0, 3, 2, 21, 10, 4, 6, 3, 4, 4, 5, 0, 21, 18, 13, 25, 19, 4, 16, 21, 11, 18, 20, 18, 2, 17, 20, 8, 23, 10, 18, 16, 16, 12, 21, 17, 20, 10, 14, 7, 15, 16, 15, 22, 14, 10, 7, 21, 25, 12, 15, 18, 20, 20, 7, 24, 8, 12, 1, 7, 13, 18, 21, 20, 24, 23, 19, 17, 6, 20, 15, 3, 23, 13, 20, 4, 18, 2, 4, 11, 0, 0, 15, 3, 10, 24, 17, 4, 10, 0, 15, 24, 0, 9, 21, 5, 23, 20, 5, 4, 12, 24, 10, 9, 4, 10, 6, 2, 14, 9, 19, 14, 20, 21, 12, 5, 22, 9, 16, 2, 13, 1, 15, 21, 2, 20, 25, 9, 0, 3, 13, 21, 20, 11, 17, 12, 6, 14, 0, 7, 22, 14, 11, 14, 17, 18, 15, 15, 4, 18, 21, 10, 5, 22, 18, 21, 21, 2, 14, 11, 23, 12, 20, 16, 0, 20, 20, 18, 7, 3, 23, 1, 19, 21, 17, 22, 8, 22, 25, 14, 14, 9, 10, 13, 4, 3, 11, 15, 23, 17, 17, 11, 9, 19, 24, 16, 5, 24, 8, 21, 25, 17, 15, 7, 4, 6, 24, 10, 11, 19, 24, 8, 17, 25, 10, 24, 5, 25, 19, 25, 25, 22, 23, 16, 2, 21, 4, 20, 4, 14, 22, 6, 9, 17, 22, 9, 9, 9, 1, 25, 4, 22, 1, 13, 10, 18, 0, 12, 20, 3, 20, 25, 2, 12, 4, 23, 6, 13, 18, 16, 4, 0, 1, 23, 12, 25, 22, 23, 9, 5, 20, 23, 17, 10, 16, 10, 25, 11, 1, 5, 9, 0, 12, 8, 10, 21, 11, 18, 15, 19, 3, 21, 3, 8, 12, 0, 18, 6, 15, 5, 25, 12, 3, 10, 17, 11, 4, 18, 15, 24, 8, 14, 7, 3, 16, 10, 2, 15, 0, 21, 16, 23, 9, 21, 24, 23, 20, 10, 0, 8, 6, 14, 3, 1, 12, 7, 22, 14, 2, 25, 25, 11, 1, 15, 14, 16, 12, 12, 3, 20, 5, 1, 23, 1, 14, 12, 7, 5, 9, 17, 23, 16, 8, 3, 3, 17, 20, 0, 23, 8, 3, 3, 12, 6, 2, 1, 17, 23, 25, 1, 15, 22, 20, 10, 5, 3, 9, 6, 3, 7, 4, 24, 3, 23, 24, 3, 4, 9, 13, 25, 3, 13, 17, 15, 3, 14, 9, 10, 15, 10, 25, 15, 0, 11, 5, 2, 5, 8, 14, 6, 13, 22, 13, 10, 5, 25, 14, 21, 23, 21, 12, 6, 21, 22, 21, 23, 3, 23, 9, 10, 12, 7, 8, 9, 0, 10, 5, 23, 14, 22, 19, 9, 10, 19, 20, 5, 2, 17, 20, 5, 9, 19, 21, 11, 0, 15, 2, 3, 20, 12, 5, 3, 17, 4, 6, 6, 3, 17, 9, 4, 23, 25, 9, 6, 6, 10, 3, 13, 15, 18, 3, 4, 18, 5, 20, 19, 25, 11, 24, 19, 12, 16, 5, 0, 15, 14, 1, 9, 10, 1, 5, 14, 13, 2, 19, 0, 11, 0, 8, 18, 4, 4, 22, 21, 11, 11, 18, 12, 4, 23, 3, 24, 15, 23, 22, 19, 7, 7, 25, 12, 13, 20, 8, 7, 24, 9, 16, 8, 19, 0, 13, 12, 0, 5, 22, 19, 15, 12, 16, 11, 25, 9, 20, 7, 2, 2, 16, 2, 19, 14, 9, 0, 12, 11, 6, 11, 21, 17, 13, 23, 1, 24, 11, 3, 19, 11, 6, 25, 1, 16, 13, 22, 14, 6, 19, 4, 17, 4, 12, 13, 2, 7, 11, 2, 17, 24, 5, 13, 23, 12, 5, 18, 4, 4, 4, 18, 11, 21, 13, 19, 1, 16, 23, 7, 9, 19, 0, 20, 4, 18, 22, 24, 4, 2, 22, 20, 13, 6, 14, 22, 0, 23, 12, 18, 16, 1, 6, 1, 22, 10, 24, 21, 19, 14, 16, 10, 7, 10, 18, 18, 4, 5, 5, 12, 7, 5, 9, 18, 2, 9, 0, 6, 12, 19, 1, 2, 25, 10, 23, 13, 25, 13, 7, 19, 6, 15, 7, 12, 18, 19, 11, 18, 0, 0, 11, 9, 24, 23, 24, 19, 5, 13, 20, 0, 1, 14, 19, 22, 1, 16, 18, 11, 10, 8, 8, 12, 12, 19, 17, 8, 23, 13, 18, 17, 3, 0, 7, 5, 2, 11, 11, 5, 15, 23, 3, 12, 16, 0, 10, 13, 14, 12, 13, 14, 17, 19, 23, 20, 9, 15, 23, 25, 17, 7, 9, 19, 14, 3, 11, 23, 2, 14, 25, 24, 23, 4, 15, 24, 6, 12, 3, 9, 7, 25, 10, 22, 5, 14, 17, 23, 19};

        System.out.println(reversePairs(nums));
    }
}
