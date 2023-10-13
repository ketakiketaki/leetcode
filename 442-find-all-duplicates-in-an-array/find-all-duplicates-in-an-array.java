class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        ArrayList<Integer> ans = new ArrayList<>();

        Arrays.sort(nums);

        //int ans = 0;

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]==nums[i])
            {
                ans.add(nums[i-1]);
            }
        }

        return ans;
    }
}