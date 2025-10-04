class Solution {
    public int maxArea(int[] height) {
        int left = 0; //intializing left pointer
        int right = height.length-1; //intializing right pointer
        int max=0;
        while(left<=right){
            int length = right-left; //calculates the length by calculating distance between two bars or lines
            int minHeight = Math.min(height[left],height[right]); // water flows out of shorter side so we use short bar or line to caluclate area
            int area = length*minHeight;
            max = Math.max(max,area); //getting max area by comparing it to previous max area
            if(height[left]<height[right]){
                left++; //making left pointer moving towards right in hope of getting a large bar
            }
            else{
                right--;
            }
        }
        return max;
    }
}