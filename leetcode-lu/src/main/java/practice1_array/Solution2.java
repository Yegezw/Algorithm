package practice1_array;

/**
 * <a href="https://leetcode.cn/problems/remove-element/">27 - 移除元素</a>
 */
public class Solution2 {

    public int removeElement(int[] nums, int val) {
        // nums[end ... nums.length - 1] = val
        int end = nums.length;
        int i = 0;
        while (i < end) {
            if (nums[i] == val) swap(nums, i, --end);
            else i++;
        }
        return end;
    }

    private void swap(int[] nums, int a, int b) {
        if (a == b) return;
        int k = nums[a];
        nums[a] = nums[b];
        nums[b] = k;
    }
}
