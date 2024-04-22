class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        prefix = [1] * len(nums)

        for i in range(1,len(nums)):
            prefix[i] = prefix[i-1] * nums[i-1]
        
        postfix = [1] * len(nums)
        
        for i in range(len(nums)-2,-1,-1):
            postfix[i] = postfix[i+1] * nums[i+1]

        res = []
        for i in range(0,len(nums)):
            res.append(prefix[i] * postfix[i])

        return res




       

        