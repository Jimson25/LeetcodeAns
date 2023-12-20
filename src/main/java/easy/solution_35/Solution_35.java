package easy.solution_35;

public class Solution_35 {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        // case 1
//         int[] nums = {1, 3, 5, 6};
//         int target = 5;

        // case 2
         int[] nums = {1, 3, 5, 6};
         int target = 2;

        // case 3
//        int[] nums = {1, 3, 5, 6};
//        int target = 0;

        Solution_35 s = new Solution_35();
        System.out.println(s.searchInsert(nums, target));
    }
}
