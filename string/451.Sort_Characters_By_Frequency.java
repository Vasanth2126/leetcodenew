class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
            }
            else
            {
                map.put(s.charAt(i),1);
            }
        }
        String a="";
       List<Character> sortmap=new ArrayList<>(map.keySet());
       sortmap.sort((x,y)->map.get(y)-map.get(x));
       for(char ch:sortmap)
       {
        int n=map.get(ch);
        while(n-->0)
        {
            a+=ch;
        }
       } 
       return a;
    }
}
