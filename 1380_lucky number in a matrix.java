class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {

      List<Integer> minnums = new ArrayList<Integer>(matrix.length) ;
        for(int i=0;i<matrix.length;i++)
        {
            int min = Integer.MAX_VALUE;
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j] < min)
                {
                    min = matrix[i][j];
                }
            }

            minnums.add(min);
        }


        List<Integer> maxnums = new ArrayList<Integer>(matrix[0].length) ;
        for(int i=0;i<matrix[0].length;i++)
        {
            int max = Integer.MIN_VALUE;
            for(int j=0;j<matrix.length;j++)
            {
                if(matrix[j][i] > max)
                {
                    max = matrix[j][i];
                }
            }
            maxnums.add(max);
        }

        List<Integer> ans = new ArrayList<>();

        for(int i=0;i<minnums.size();i++)
        {
            if(maxnums.contains(minnums.get(i)))
            {
                ans.add(minnums.get(i));
            }
        }

        return ans;
     }  
}
