package org.example;

public class BoyerMoore {
    public static int[] badCharHeuristic(String pattern) {
        int[] badChar = new int[256];

        for (int i = 0; i < 256; i++) {
            badChar[i] = -1;
        }

        for (int i = 0; i < pattern.length(); i++) {
            badChar[pattern.charAt(i)] = i;
        }

        return badChar;
    }

    public static int boyerMooreSearch(String text, String pattern) {
        int m = pattern.length();
        int n = text.length();

        int[] badChar = badCharHeuristic(pattern);
        int count = 0;
        int shift = 0;

        while (shift <= (n - m)) {
            int j = m - 1;

            while (j >= 0 && pattern.charAt(j) == text.charAt(shift + j)) {
                j--;
            }

            if (j < 0) {
                count++;
                shift += (shift + m < n) ? m - badChar[text.charAt(shift + m)] : 1;
            } else {
                shift += Math.max(1, j - badChar[text.charAt(shift + j)]);
            }
        }

        return count;
    }
}
