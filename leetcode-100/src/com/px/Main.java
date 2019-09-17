/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean result =true;
        TreeNode first = p;
        TreeNode second = q;
        if(first !=null || second !=null){
            if(first !=null && second !=null && first.val == second.val){
                result &= isSameTree(first.left, second.left);
                result &= isSameTree(first.right, second.right);
            }else{
                result = false; 
            }           
        }
        return result;
    }
}
