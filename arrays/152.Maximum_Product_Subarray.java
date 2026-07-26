class Solution {
    public int maxProduct(int[] nums) {
       int[] maxdp=new int[nums.length];
       int[] mindp=new int[nums.length];
       maxdp[0]=nums[0];
       mindp[0]=nums[0];
       int max=nums[0];
       for(int i=1;i<nums.length;i++)
       {
           maxdp[i]=Math.max(nums[i],Math.max(nums[i]*maxdp[i-1],nums[i]*mindp[i-1]));
           
           mindp[i]=Math.min(nums[i],Math.min(nums[i]*maxdp[i-1],nums[i]*mindp[i-1]));

           max=Math.max(max,maxdp[i]);
       }
       return max;
    }
}
