class Solution {
    public String longestCommonPrefix(String[] strs) {

        String a = "";
        int ind = 0;
        boolean fl = true;

        while (fl) {

            int pass = 0;
            if (ind >= strs[0].length()) {
                break;
            }

            char c = strs[0].charAt(ind);

            for (int i = 1; i < strs.length; i++) {

                if (ind < strs[i].length() &&
                    strs[i].charAt(ind) == c) {

                    pass++;
                }
                else {
                    fl = false;
                    break;
                }
            }

            if (pass == strs.length - 1) {
                a += c;
            }

            ind++;
        }

        return a;
    }
}
