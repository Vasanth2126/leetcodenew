class Solution {
    public Set<List<Integer>> mainlist=new HashSet<>();
    
    public void back(int[]nums,List<Integer>list1,int ind)
    {
        if(ind>=nums.length)
        {
            mainlist.add(new ArrayList<>(list1));
            return;
        }
        list1.add(nums[ind]);
        back(nums,list1,ind+1);
        list1.remove(list1.size()-1);
        back(nums,list1,ind+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        back(nums,new ArrayList<>(),0);
        return new ArrayList<>(mainlist);
    }
}
