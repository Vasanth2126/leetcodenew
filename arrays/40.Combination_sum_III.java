class Solution {
    public List<List<Integer>> mainlist=new ArrayList<>();
    public void back(int[]a,List<Integer> list,int ind,int tar)
    {
        if(tar==0)
        {
            mainlist.add(new ArrayList<>(list));
            return;
        }
        for(int i=ind;i<a.length;i++)
        {
            if(i>ind && a[i]==a[i-1])
            {
                continue;//break;
            }
            if(a[i]>tar)
            {
                break;
            }
            list.add(a[i]);
            back(a,list,i+1,tar-a[i]);
            list.remove(list.size()-1);
        }
    }
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        back(candidates,new ArrayList<>(),0,target);
        return mainlist;
    }
}
