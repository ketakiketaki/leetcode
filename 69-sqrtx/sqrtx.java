class Solution {
    public int mySqrt(int x) {
        
        if(x==0)
        {
            return 0;
        }
        if(x==1)
        {
            return 1;
        }
        
        for(int i=1;i<=x/2;i++)
        {

            if((long)i*i>x)
            {
                return (int)i-1;
            }
            else if((long)i*i==x)
            {
                return (int)i;
            }
        }
        return x/2;
    }
}