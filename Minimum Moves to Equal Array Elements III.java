class Solution {
    public int minMoves(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        int n = nums.length;
        int max = nums[n-1];
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<max;j++)
            {
                if(nums[i]<max)
                {
                    nums[i]++;
                    count++;
                }
            }
        }
        return count;
    }
}
