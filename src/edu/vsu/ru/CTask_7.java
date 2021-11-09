package edu.vsu.ru;

public class CTask_7 {
    static int findMaximallyRepeatSubsequence(int[] array, int n) {
        int maxSubseq1Quan = 0;
        int maxi = 0;
        for (int i = 0; i < array.length - 2 * n; i++) {
            int subseq1Quan = 0;

            for (int j = i + n; j <= array.length - n; j++) {
                if (compareSubsequences(array, n, i, j)) {
                    subseq1Quan++;
                    j += 2;
                }
            }

            if (subseq1Quan > maxSubseq1Quan) {
                maxSubseq1Quan = subseq1Quan;
                maxi = i;
            }
        }
        return maxi;
    }

    static boolean compareSubsequences(int[] array, int n, int i, int j) {
        for (int k = 0; k < n; k++) {
            if (array[i + k] != array[j + k]) return false;
        }
        return true;
    }
}
