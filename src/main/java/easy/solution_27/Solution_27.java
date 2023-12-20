package easy.solution_27;

import java.util.Arrays;

class Solution_27 {
    public int removeElement(int[] nums, int val) {
        int eqIndex = 0, noEqIndex = 0;

        while (noEqIndex < nums.length && eqIndex < nums.length) {
            if (nums[eqIndex] != val) {
                eqIndex++;
                continue;
            }

            if (noEqIndex <= eqIndex) {
                noEqIndex = eqIndex + 1;
                continue;
            }

            if (nums[noEqIndex] == val) {
                noEqIndex++;
                continue;
            }

            int t = nums[eqIndex];
            nums[eqIndex] = nums[noEqIndex];
            nums[noEqIndex] = t;
            noEqIndex++;
            eqIndex++;

        }
        return eqIndex;
    }

    public static void main(String[] args) {
        Solution_27 s = new Solution_27();
        int[] nums = {2};
        int val = 3;


        System.out.println(s.removeElement(nums, val));
        System.out.println(Arrays.toString(nums));


    }
}