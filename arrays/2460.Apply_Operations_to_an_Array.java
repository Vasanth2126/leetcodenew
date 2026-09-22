class Solution {
    public int[] applyOperations(int[] nums) {
       // int[]a=new int[nums.length];
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
            {
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
        int zero=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                int temp=nums[i];
                nums[i]=nums[zero];
                nums[zero]=temp;
                zero++;
            }
        }
        return nums;
    }
}
