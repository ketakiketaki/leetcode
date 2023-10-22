class Solution {
    public double angleClock(int hour, int minutes) {
        

        double hr = (hour%12 *30) + (double)minutes*0.5;

        double min = minutes*6;

        double angle = Math.abs(min-hr);

        if(angle>180)
        {
            angle = 360.0-angle;
        }

        return angle;


    }
}