class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        st.push(0);
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(')
            {
                st.push(0);
                
            }
            else
            {
                int x=st.pop();
                int val;
                if(x==0)
                {
                    val=1;
                }
                else
                {
                    val=2*x;
                }
                st.push(st.pop()+val);
            }
        }
       
        return st.pop();
    }
}
