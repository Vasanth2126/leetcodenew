class Solution {
    public void back(List<List<Integer>> result,ArrayList<Integer> temp,int[] nums)
    {
        if(temp.size()==nums.length)
        {
            result.add(new ArrayList<>(temp));
        }
        for(int num:nums)
        {
            if(temp.contains(num))
            {
                continue;
            }
            temp.add(num);
            back(result,temp,nums);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        back(result,new ArrayList<>(),nums);
        return result;
    }
}
