class Solution {

    public int helper(int[] nums,int start,int end,int target)
    {
        if(start>end)
            return -1;

        int mid = start + (end-start)/2;

        if(nums[mid]==target)
            return mid;

        if(nums[mid]<target)
            return helper(nums,mid+1,end,target);

        return helper(nums,start,mid-1,target);

    }
    public int search(int[] nums, int target) {
        
        int start = 0;
        int end = nums.length-1;

        return helper(nums,start,end,target);

    }
}