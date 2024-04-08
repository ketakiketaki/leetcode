class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        len_s = len(s)
        len_t = len(t)

        sorted_s = sorted(s.lower())
        sorted_t = sorted(t.lower())

        if len_s != len_t or len_s == 0 or len_t == 0:
            return False
        
        for i in range(0,len_s):
            if sorted_s[i] != sorted_t[i]:
                return False
         

        return True

        