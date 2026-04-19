class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int []num=new int[n1+n2];
        System.arraycopy(nums1,0,num,0,n1);
        System.arraycopy(nums2,0,num,n1,n2);
        Arrays.sort(num);
        int n=num.length;
        if(n%2==0)
        {
            double out=(num[n/2]+num[(n/2)-1]);
            out=out/2;
            return out;
        }
        else
        {
            return (num[n/2]);
        }
    }
}
