class Solution {
    public int heightChecker(int[] heights) {

        int[] original = new int[heights.length];
    
        for(int i=0;i<heights.length;i++)
        {
            original[i] = heights[i];
        } 

        Arrays.sort(heights);    

        int count = 0;

        for(int j=0;j<heights.length;j++)
        {
            if(original[j] != heights[j])
            {
                count++;
            }
        }

        return count;   
    }
}