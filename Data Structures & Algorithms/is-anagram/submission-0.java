class Solution {
    public boolean isAnagram(String s, String t) {

        int[] arr = new int[26];

        int n = s.length();
        int o = t.length();

        if (n != o) {
            return false;
        }

        // Count characters in s
        for (int i = 0; i < n; i++) {
            int p = s.charAt(i) - 'a';
            arr[p]++;
        }

        // Subtract characters in t
        for (int i = 0; i < o; i++) {
            int q = t.charAt(i) - 'a';
            arr[q]--;
        }

        // Check if all character counts are zero
        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }

        return true;
    }
}