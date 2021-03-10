class Solution {
    public int maxArea(int[] height) {
       int i=0;
       int j=height.length-1;
       int area=0;
        
        while(i<j){
            
            int ar=Math.min(height[i],height[j])*(j-i);
            
            if(ar>area)
                 area=ar;
            
            if(height[i]<=height[j])
                 i++;
            else
                j--;
            
        }
        
        return area;
        
    }
}
