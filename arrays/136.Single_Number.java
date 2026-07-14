class Solution {
    public int singleNumber(int[] nums) {
        int v=0;
        for(int x:nums)
        {
            v^=x;
        }
        return v;
    }
}