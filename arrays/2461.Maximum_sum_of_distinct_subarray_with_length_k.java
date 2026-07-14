class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int left=0;
        long max=0,sum=0;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            while(set.contains(nums[i]))
            {
                set.remove(nums[left]);
                sum-=nums[left];
                left++;
            }
            set.add(nums[i]);
            sum+=nums[i];
            if(i-left+1==k)
            {
                max=Math.max(max,sum);
                set.remove(nums[left]);
                sum-=nums[left];
                left++;
            }
        }
        return max;
    }
}