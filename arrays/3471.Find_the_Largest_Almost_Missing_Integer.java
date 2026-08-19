class Solution {
    public int largestInteger(int[] nums, int k) {
        int[]a=new int[nums.length];
        ArrayList<ArrayList<Integer>>mainlist=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<k;i++)
        {
            list.add(nums[i]);
        }
        mainlist.add(list);
        int i=1,j=k;
        while(j<nums.length)
        {
            ArrayList<Integer>list1=new ArrayList<>();
            for(int x=i;x<=j;x++)
            {
                list1.add(nums[x]);
            }
            mainlist.add(new ArrayList<>(list1));
            i++;
            j++;
        }
        for(i=0;i<nums.length;i++)
        {
            int c=0;
            for(j=0;j<mainlist.size();j++)
            {
             list=mainlist.get(j);
            if(list.contains(nums[i]))
            {
                c++;
            }
            }
            a[i]=c;
        }
        int ans=-1;
        for(i=0;i<a.length;i++)
        {
            if(a[i]==1)
            {
                ans=Math.max(ans,nums[i]);
            }
        }
         return ans;
    }
}
