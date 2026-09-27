class Solution {
    public boolean findSubarrays(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int left=0,right=1;
        while(right<nums.length)
        {
            if(list.contains(nums[left]+nums[right]))
            {
                return true;
            }
            list.add(nums[left]+nums[right]);
            left++;
            right++;
        }
        return false;
    }
}
