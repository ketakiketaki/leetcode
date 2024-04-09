class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        anagram_dict = defaultdict(list)

        for word in strs:
            key = ''.join(sorted(word.lower()))
            anagram_dict[key].append(word)
        return list(anagram_dict.values())