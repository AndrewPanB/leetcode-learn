class Solution {
    public boolean isValidSudoku(char[][] board) {
        List<Map<Character, Boolean>> row = new ArrayList<>();
        List<Map<Character, Boolean>> column = new ArrayList<>();
        List<Map<Character, Boolean>> block = new ArrayList<>();

        for (int k = 0; k < 9; k++) {
            row.add(new HashMap<>());
            column.add(new HashMap<>());
            block.add(new HashMap<>());
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c != '.') {
                    int boxIndex = (i / 3) *3 + j / 3;
                    if (row.get(i).get(c) != null && row.get(i).get(c)) {
                        return false;
                    } else if (column.get(j).get(c) != null && column.get(j).get(c)) {
                        return false;
                    } else if (block.get(boxIndex).get(c) != null && block.get(boxIndex).get(c)) {
                        return false;
                    } else {
                        row.get(i).put(c, true);
                        column.get(j).put(c, true);
                        block.get(boxIndex).put(c, true);
                    }
                }
            }
        }
        return true;
    }
}
