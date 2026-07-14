class Solution {
    public String reverseWords(String s) {
        String[] num=s.trim().split(" ");
        s="";
        for(int i=num.length-1;i>=0;i--)
        {
            s+=num[i];
            if(i!=0)
            {
                s+=" ";
            }
        }
        s=s.trim().replaceAll("\\s+"," ");
        return s;
    }
}