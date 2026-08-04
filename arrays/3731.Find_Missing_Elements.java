class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list=new ArrayList<>();
        List<Integer> list1=new ArrayList<>();

        for(int x:nums)
        {
            list.add(x);
        }
        for(int i=nums[0];i<nums[nums.length-1];i++)
        {
            if(!list.contains(i))
            {
                list1.add(i);
            }
        }
        return list1;
    }
}
