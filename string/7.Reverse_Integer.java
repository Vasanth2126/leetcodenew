class Solution {
    public int reverse(int x) {
        long temp;
        if(x<0)
        {
            temp=-(long)x;
        }
        else
        {
         temp=(long)x;
        }
        long val=0;
        while(temp>0)
        {
            val=(val*10)+temp%10;
            temp/=10;
        }
        if(val<Integer.MIN_VALUE || val>Integer.MAX_VALUE)
        {
            return 0;
        }
        if(x<0)
        {
            return -(int)val;
        }
        return (int)val;
    }
}
