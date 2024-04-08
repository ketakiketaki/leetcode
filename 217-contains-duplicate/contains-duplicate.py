class Solution(object):
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        if len(nums) <= 1:
            return False

        nums.sort()

        for i in range(0,len(nums)):
            if(nums[i-1] == nums[i]):
                return True
                break

        return False
        