class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int a = arrivalTime + delayedTime;
        if (a>23)
        {
            return (a-24);
        }
        else
        {
            return a;
        }
    }
}
