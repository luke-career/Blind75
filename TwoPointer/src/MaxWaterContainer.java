package src;

public class MaxWaterContainer {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int res = 0;
        while(l < r){
            int area = Math.min(heights[l],heights[r]) * (r - l);
            res = Math.max(area,res);
            if(heights[r] > heights[l]){
                l++;
            }else {
                r--;
            }
        }
        return res;
    }
}
