/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.offer(root);
        }
        int size = 0;
        int row = 1;
        long maxSum = (long) Integer.MIN_VALUE;
        int maxRow = 1;
        while (!queue.isEmpty()) {
            long tempSum = 0;
            size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                tempSum += (long) node.val;
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            if (tempSum > maxSum) {
                maxSum = tempSum;
                maxRow = row++;
            } else {
                row++;
            }
        }
        return maxRow;
    }
}
