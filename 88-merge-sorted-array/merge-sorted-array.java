class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] res = new int[nums1.length];

        if(n==0) return;
        if(m==0) 
        {
           for(int i=0;i<nums2.length;i++)
            {
                nums1[i] = nums2[i];
            }
        }

        int index1 = 0;
        int index2 = 0;
        int k = 0;

        while(index1<m && index2<n)
        {
            if(nums1[index1]<=nums2[index2])
            {
                res[k] = nums1[index1];
                k++;
                index1++;
            }
            else
            {
               res[k] = nums2[index2];
                k++;
                index2++; 
            }
        }

        while(index1 < m)
        {
            res[k++] = nums1[index1++];
        }

        while(index2 < n)
        {
            res[k++] = nums2[index2++];
        }

        for(int i=0;i<res.length;i++)
        {
            nums1[i] = res[i];
        }
        
    }
}