class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];

        for (char c : tasks) {
            freq[c - 'A']++;
        }

        int maxFreq = 0;

        for (int f : freq) {
            maxFreq = Math.max(maxFreq, f);
        }

        int count = 0;

        for (int f : freq) {
            if (f == maxFreq) {
                count++;
            }
        }

        return Math.max(tasks.length, (maxFreq - 1) * (n + 1) + count);
    }
}
