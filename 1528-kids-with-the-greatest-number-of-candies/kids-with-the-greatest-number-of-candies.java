class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        int max = candies[0];
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]>max)
            {
                max = candies[i];
            }
        }

        ArrayList<Boolean> arr = new ArrayList<Boolean>(candies.length);
        for(int i=0;i<candies.length;i++)
        {
            int total = candies[i]+extraCandies;

            if(total>=max)
            {
                arr.add(true);
            }
            else
            {
                arr.add(false);
            }
        }

        return arr;
    }
}