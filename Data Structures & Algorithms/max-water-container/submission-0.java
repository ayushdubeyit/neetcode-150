class Solution {
    public int maxArea(int[] heights) {
      int n = heights.length;
      int max =Integer.MIN_VALUE;
      for(int i=0; i<heights.length; i++){
            int area = 0;
            for(int j=i+1; j<n; j++){
                area = (j-i)*Math.min(heights[i],heights[j]);
                max = Math.max(max,area);
            }
      }

        return max;
    }
}
