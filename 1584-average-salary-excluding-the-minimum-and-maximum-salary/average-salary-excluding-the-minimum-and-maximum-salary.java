class Solution {
    public double average(int[] salary) {

        int n = salary.length;

        Arrays.sort(salary);

        double sum = 0;

        for(int i=1;i<salary.length-1;i++)
        {
            sum += salary[i];
        }

        return sum/(n-2);
        
    }
}