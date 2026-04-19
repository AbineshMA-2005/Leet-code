class Solution {
    public int[] countBits(int n) {
        int[] num = new int[n+1];
        int t;
        for (int i=0;i<n+1;i++)
        {
            int count = 0;
            int a=i;
            while(a>0)
            {
                t=a%2;
                if(t==1)
                {
                    count++;
                }
                a=a/2;
            }
            num[i]=count;
        }
        return num;
    }
}
