class Solution(object):
    def topKFrequent(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: List[int]
        """

        obj = Counter(nums)
        
        res = [i for i,_ in obj.most_common(k)]

        return res