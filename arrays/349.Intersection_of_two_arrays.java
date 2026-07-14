class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
     HashSet<Integer> l1=new HashSet<>();
     HashSet<Integer> l2=new HashSet<>();
     for(int n:nums1)
     {
        l1.add(n);
     }   
     for(int n:nums2)
     {
        if(l1.contains(n))
        {
           l2.add(n);
        }
     }
     int[] a=new int[l2.size()];
     int i=0;
     for(int n:l2)
     {
        a[i++]=n;
     }
     return a;
    }
}