int maxProduct(int n) {
    int max1=0;
    int max2=0;
    int out,a;
    while(n>0)
    {
        a=n%10;
        if(a>max1)
        {
            max2=max1;
            max1=a;
        }
        else if(a>max2)
        {
            max2=a;
        }
        n=n/10;
    }
    out=max1*max2;
    return out;
}
