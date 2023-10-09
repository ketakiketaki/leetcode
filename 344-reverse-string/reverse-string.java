class Solution {

    public void helper(char[] s, int start , int end)
    {
        if(start>=end)
        {
            return;
        }

        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;

        helper(s,start+1,end-1);
    }
    public void reverseString(char[] s) {
        
        int start = 0;
        int end = s.length-1;

        helper(s,start,end);

    }
}