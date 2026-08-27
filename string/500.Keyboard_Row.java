class Solution {
    public String[] findWords(String[] words) {
        String a1 = "qwertyuiop";
        String a2 = "asdfghjkl";
        String a3 = "zxcvbnm";
        List<String> list = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (!a1.contains(String.valueOf(word.charAt(j)))) {
                    break;
                }
                count++;
            }
            if (word.length() == count) {
                list.add(words[i]);
                continue;
            }
            count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (!a2.contains(String.valueOf(word.charAt(j)))) {
                    break;
                }
                count++;
            }
            if (word.length() == count) {
                list.add(words[i]);
                continue;
            }
            count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (!a3.contains(String.valueOf(word.charAt(j)))) {
                    break;
                }
                count++;
            }
            if (word.length() == count) {
                list.add(words[i]);
            }
        }
        return list.toArray(new String[0]);
    }
}
