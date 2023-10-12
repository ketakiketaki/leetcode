class Solution {
    public int xorOperation(int n, int start) {

        ArrayList<Integer> res = new ArrayList<>(n);

        res.add(start);
        for(int i=1; i<n; i++)
        {
            res.add(start + 2 * i);
        } 

        int ans = 0;
        for(int j=0;j<n;j++)
        {
            ans = ans ^ res.get(j);
        }

        return ans;
    }
}