class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[]ar=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            int c=0;
            int ind=0;
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    ind=j;
                }
            }
            for(int z=ind;z<nums2.length;z++)
            {
                if(nums1[i]<nums2[z])
                {
                    c=nums2[z];
                    break;
                }
            }
            if(c==0)
            {
                ar[i]=-1;
            }
            else
            {
            ar[i]=c;
            }
        }
        return ar;
    }
}
