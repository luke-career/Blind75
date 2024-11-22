import java.util.HashMap;

public class BinarySubarraysWithSum {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int preSum = 0;
        int count = 0;

        for(int i = 0 ; i < nums.length;i++){
            preSum += nums[i];
            if(map.containsKey(preSum - goal)){
                count += map.get(preSum - goal);
            }
            map.put(preSum,map.getOrDefault(preSum,0) + 1);
        }

        return count;
    }
}
