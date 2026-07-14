class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        Queue<Character>q=new PriorityQueue<>();
        for(int i=0;i<s.length();i++)
        {
            q.add(s.charAt(i));
        }
        for(int i=0;i<t.length();i++)
        {
            if(q.contains(t.charAt(i)))
            {
                q.remove(t.charAt(i));
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}