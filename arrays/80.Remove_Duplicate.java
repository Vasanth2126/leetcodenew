class Solution {
    public int removeDuplicates(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int x : nums)
            list.add(x);

        for(int i=0;i<list.size();i++)
        {
            if(map.containsKey(list.get(i)))
            {
                if(map.get(list.get(i)) >= 2)
                {
                    list.remove(i);
                    i--;
                }
                else
                {
                    map.put(list.get(i), map.get(list.get(i)) + 1);
                }
            }
            else
            {
                map.put(list.get(i),1);
            }
        }

        for(int i=0;i<list.size();i++)
            nums[i]=list.get(i);

        return list.size();
    }
}
