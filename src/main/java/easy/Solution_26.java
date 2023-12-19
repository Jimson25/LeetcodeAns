package easy;

public class Solution_26 {
    public int removeDuplicates(int[] nums) {
        int nextIndex = 1, currIndex = 0;

        while (nextIndex < nums.length) {
            if (nums[currIndex] != nums[nextIndex]) {
                nums[++currIndex] = nums[nextIndex];
            }
            nextIndex++;
        }

        return ++currIndex;
    }
}
