import java.util.*;
class Solution {
    public int missingMultiple(int[] nums, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list1=new ArrayList<>();
        
        for(int x:nums)
        {
            list1.add(x);
        }

        Arrays.sort(nums);

        int max=0;

        for(int i=k;i<=nums[nums.length-1];i+=k)
        {
            list.add(i);
        }

        for(int x:list)
        {
            max=Math.max(max,x);
        }
        for(int i=0;i<list.size();i++)
        {
            if(!list1.contains(list.get(i)))
            {
                return list.get(i);
            }
        }
        return max+k;

    }
}
