class Solution {
    public String convert(String s, int numRows) {
        if (s.length() < 2 || numRows < 2) {
            return s;
        }
        String[] str = new String[numRows];
        for (int i = 0; i < numRows; i++) {
            str[i] = "";
        }
        boolean down = true;
        int row = 0;
        for (int i = 0; i < s.length(); i++) {
            str[row] += s.substring(i, i + 1);
            if (row == 0) {
                down = true;
            } else if (row == numRows - 1) {
                down = false;
            }
            if (down) {
                row++;
            } else {
                row--;
            }
        }
        StringBuilder result = new StringBuilder();
        for (String value : str) {
            result.append(value);
        }
        return result.toString();
    }
}
