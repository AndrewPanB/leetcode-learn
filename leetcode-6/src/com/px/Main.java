class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 0 || numRows == 1 || s == null || s.length() <= 1 || s.length() <= numRows) {
            return s;
        }
        int length = s.length();
        int temp = (length - 1) % (2 * (numRows - 1));
        if (temp > numRows - 1) {
            temp = temp - numRows + 1;
        } else {
            temp = 0;
        }
        int unitLength = (length - 1) / (2 * (numRows - 1));
        int numColumns = unitLength * numRows + temp + 1;
        char[][] zChars = new char[numRows][numColumns];
        StringBuilder result = new StringBuilder();
        int row = 0;
        int column = 0;
        boolean flag = true;
        for (int i = 0; i < length; i++) {
            zChars[row][column] = s.charAt(i);
            if (column + row > 0 && (row == 0 || row == numRows - 1)) {
                flag = !flag;
            }
            if (flag) {
                row++;
            } else {
                row--;
                column++;
            }

        }
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                if (zChars[i][j] != '\0') {
                    result.append(zChars[i][j]);
                }
            }
        }
        return result.toString();
    }
}
