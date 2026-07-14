class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0,j=numbers.length-1;
        int[]index=new int[2];
        while(i<j)
        {
            int n=numbers[i]+numbers[j];
            if(n==target)
            {
                index[0]=i+1;
                index[1]=j+1;
                return index;
            }
            else if(n>target)
            {
                j--;
            }
            else if(n<target)
            {
                i++;
            }
        }
        return index;
    }
}