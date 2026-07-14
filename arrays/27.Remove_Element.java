class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                list.add(nums[i]);
            }
        }
        int i=0;
        for(int x:list)
        {
         nums[i++]=x;
        }
        return list.size();
    }
}