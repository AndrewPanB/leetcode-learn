class Solution {
    public int uniquePaths(int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if (m == 1 || n == 1) {
            return 1;
        }


        int[][] sum = new int[m + 1][n + 1];
        sum[1][1] = 1;
        for (int k = 1; k < m + 1; k++) {
            sum[k][1] = 1;
        }
        for (int k = 1; k < n + 1; k++) {
            sum[1][k] = 1;
        }
        int i = 2;
        int j = 2;
        while (i <= m) {
            j = 2;
            while (j <= n) {
                sum[i][j] = sum[i][j - 1] + sum[i - 1][j];
                j++;
            }
            i++;
        }
        return sum[m][n];
    }
}
