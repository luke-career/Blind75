public class RangeSumQueryImmutable {
    private int[] nums;


    public RangeSumQueryImmutable(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        for(int i = left; i <= right;i++){
            sum += nums[i];
        }
        return sum;
    }
}
