package src;

import java.util.Arrays;

public class MinimumDifferenceBetweenHighestandLowestofKScores {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        for(int i = 0; i + k - 1 < nums.length;i++ ){
            min = Math.min(nums[i + k -1] - nums[i],min);
        }
        return min;
    }
}
