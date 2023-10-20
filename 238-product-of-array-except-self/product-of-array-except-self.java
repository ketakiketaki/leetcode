class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] ans = new int[nums.length];
        
        int zerocount = 0;
        int product = 1;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                zerocount++;
            }
            else
            {
                product = product*nums[i];
            }
        }

        if(zerocount == 0)
        {
            for(int j=0;j<nums.length;j++)
            {
                ans[j] = product/nums[j];
            }

        }
        else if(zerocount == 1)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]==0)
                {
                    ans[j] = product;
                }
                
            }
        }

        return ans;
    }
}