class Solution {
    public int numberOfSpecialChars(String word) {
        boolean[] lower = new boolean[26]; // track lowercase presence
        boolean[] upper = new boolean[26]; // track uppercase presence

        // Scan the string
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isLowerCase(c)) {
                lower[c - 'a'] = true;
            } else {
                upper[c - 'A'] = true;
            }
        }

        // Count letters that appear in both cases
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (lower[i] && upper[i]) {
                count++;
            }
        }
        return count;
    }
}

