class Solution {
    public int getKth(int lo, int hi, int k) {
        int[]a1=new int[hi-lo+1];
        int[]a2=new int[hi-lo+1];
        int ind=0;
        for(int i=lo;i<=hi;i++)
        {
            a1[ind++]=i;
        }
        for(int i=0;i<ind;i++)
        {
            int t=a1[i];
            int count=0;
            while(t!=1)
            {
                if(t%2==0)
                {
                    t=t/2;
                }
                else
                {
                    t=3*t+1;
                }
                count++;
            }
            a2[i]=count;
        }
        for(int i=0;i<ind-1;i++)
        {
            for(int j=0;j<ind-1;j++)
            {
                if(a2[j]>a2[j+1])
                {
                    int temp=a2[j];
                    a2[j]=a2[j+1];
                    a2[j+1]=temp;
                    
                    temp=a1[j];
                    a1[j]=a1[j+1];
                    a1[j+1]=temp;
                    
                }
            }
        }
        return a1[k-1];
    }
}
