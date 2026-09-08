class Solution {
    public int countCommas(int n) {
      long ans=0;
      for(int i=1; ;i++)
      {
        long ver=(long)Math.pow(1000,i);
        if(ver>n)
        {
            break;
        }
        ans+=n-ver+1;
      }
      return (int)(ans);
    }
}
