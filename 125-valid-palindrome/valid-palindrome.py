class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        temp_s = ''.join(e for e in s if e.isalnum())
        res = temp_s.lower()

        i = 0
        j = len(res)-1

        while i<=j:
            if res[i] != res[j]:
                return False
                break
            i += 1
            j -= 1

        return True
            