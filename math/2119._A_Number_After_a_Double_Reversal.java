class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp=num;
        int val=0;
        while(temp>0)
        {
            val=(val*10)+temp%10;
            temp/=10;
        }
        temp=val;
        val=0;
        while(temp>0)
        {
            val=(val*10)+temp%10;
            temp/=10;
        }
        if(num==val)
        {
            return true;
        }
        return false;
    }
}
