class Solution {
    public int minPartitions(String n) {
        int max=0;
        int i;
        int k=n.length();
        for (i=0;i<k;i++)
        {
            char d = n.charAt(i);
            String s= d+"";
            int num = Integer.parseInt(s);
            if(num>max)
            {
                max=num;
            }
        }
        return max;
    }
}
