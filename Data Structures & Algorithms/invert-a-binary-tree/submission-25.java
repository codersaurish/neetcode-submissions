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
    public TreeNode invertTree(TreeNode root) {
        if(root==null)return null;
        Queue<TreeNode>heap=new LinkedList<>();
        heap.offer(root);
        while(!heap.isEmpty()){
            TreeNode node=heap.poll();
            TreeNode tmp=node.left;
            node.left=node.right;
            node.right=tmp;
            if(node.left!=null)heap.offer(node.left);
            if(node.right!=null)heap.offer(node.right);
        }
        return root;
    }
}
