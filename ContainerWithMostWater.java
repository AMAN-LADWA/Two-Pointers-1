// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No



class Solution {
    public int maxArea(int[] height) {
        if(height==null) return 0;
        int max= 0;
        int left = 0; int right = height.length-1;
        while(left<right){
            max = Math.max(max,(right-left)*Math.min(height[left],height[right]));
            if(height[left]<=height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}
