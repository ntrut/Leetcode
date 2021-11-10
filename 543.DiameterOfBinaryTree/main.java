/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    int ans = 0;
    public int diameterOfBinaryTree(TreeNode root) 
    {
       if(root == null)
       {
           return 0;
       }
        
        int h = height(root);
        System.out.println(h);
        return ans;
    }
    
    public int height(TreeNode root)
    {
        if(root == null)
        {
            return -1;
        }
        
        int l = height(root.left);
        int r = height(root.right);
         ans = Math.max(ans, l+r+2);
        return 1 + Math.max(l, r);
    }
}