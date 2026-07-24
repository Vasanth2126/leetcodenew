class Solution {
    public int rob(int[] nums) {
        int[]dp=new int[nums.length];
        // dp[0]=nums[0];
        // dp[1]=Math.max(nums[0],nums[1]);
        for(int i=0;i<nums.length;i++)
        {
            if(i>1)
            {
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
            }
            else if(i==0)
            {
                dp[i]=nums[0];
            }
            else if(i==1)
            {
                dp[i]=Math.max(nums[0],nums[1]);
            }
        }
        return dp[nums.length-1];
    }
}
