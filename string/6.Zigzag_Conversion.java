class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1 || numRows >= s.length()) {
            return s;
        }

        String[] row = new String[numRows];

        for (int i = 0; i < numRows; i++) {
            row[i] = "";
        }

        int h = 1;
        int ind = 0;
        int index = 0;

        while (index < s.length()) {

            row[h - 1] += s.charAt(index);

            if (ind == 0) {
                h++;
            }
            else {
                h--;
            }

            if (h == numRows) {
                ind = 1;
            }

            if (h == 1) {
                ind = 0;
            }

            index++;
        }

        String ans = "";

        for (int i = 0; i < numRows; i++) {
            ans += row[i];
        }

        return ans;
    }
}
