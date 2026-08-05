class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]<target && target<=nums[i+1])
            {
                return i+1;
            }
        }
        if(nums[nums.length-1]<target)
        {
            return nums.length;
        }
        return 0;
    }
}
