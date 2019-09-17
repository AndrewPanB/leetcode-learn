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
    
    public boolean isValidBST(TreeNode root) {
        Stack<Integer> stack = new Stack<>();
        getStack(root, stack);
        Integer temp = null;
        while(!stack.isEmpty()){
            Integer popVal = stack.pop();
            if(temp==null){
                temp = popVal;
            }else if(temp<=popVal){
                return false;
            }else{
                temp = popVal;
            }
        }
        return true;
    }
    
    private void getStack(TreeNode root, Stack<Integer> stack){
        if(root !=null){
            getStack(root.left, stack);
            stack.push(new Integer(root.val));
            getStack(root.right, stack);
        }
    }
}
