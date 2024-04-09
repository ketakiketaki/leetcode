class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        len_s = len(s)
        len_t = len(t)

        sorted_s = ''.join(sorted(s.lower()))
        sorted_t = ''.join(sorted(t.lower()))

        if len_s != len_t or len_s == 0 or len_t == 0:
            return False
        
        if sorted_s != sorted_t:
                return False 

        return True

        