class Solution {
    public int heightChecker(int[] heights) {
       int i;
       int count=0;
       int n= heights.length;
       int[] exp = Arrays.copyOf(heights,n);
       Arrays.sort(exp);
       for (i=0;i<n;i++)
       {
        if (heights[i] != exp[i])
        {
            count=count+1;
        }
       }
       return count;
    }
}
