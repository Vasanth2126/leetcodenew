import java.util.regex.*;
class Solution {
    public boolean isMatch(String s, String p) {
        Pattern P=Pattern.compile(p);
        Matcher M=P.matcher(s);
        if(M.matches())
        {
            return true;
        }
        return false;q
    }
}
