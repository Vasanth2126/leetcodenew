class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
       // ArrayList<String> list=new ArrayList<>();
        String ans="";
        int[] a=new int[2];
        int left=0,cou=0;
        for(int right=0;right<s.length();right++)
        {
            if(s.charAt(right)=='1')
            {
                cou++;
            }
            while(cou>k)
            {
                if(s.charAt(left)=='1')
                {
                    cou--;
                }
                left++;
            }
        
        if(cou==k)
        {
            while(s.charAt(left)=='0')
            {
                left++;
            }
            String temp=s.substring(left,right+1);
            if(ans.equals("")||temp.length()<ans.length()||(temp.length()==ans.length() && temp.compareTo(ans)<0))
            {
                ans=temp;
            }
        }
        }
       return ans;
    }
}
