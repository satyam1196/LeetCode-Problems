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
    public TreeNode createBinaryTree(int[][] descriptions) {
        //CodeStory with Mik
        Map<Integer,TreeNode> map=new HashMap<>();
        Set<Integer> set=new HashSet<>();
        TreeNode parentNode=null,childNode=null;
        
        for(int[] data:descriptions){
            int parent=data[0];
            int child=data[1];
            int left=data[2];
            
            if(!map.containsKey(parent)){
                TreeNode pNode=new TreeNode(parent);
                map.put(parent,pNode);
            }
            if(!map.containsKey(child)){
                TreeNode cNode=new TreeNode(child);
                map.put(child,cNode);
            }
            
            parentNode=map.get(parent);
            childNode=map.get(child);
            set.add(child);
            
            if(left==1){
                parentNode.left=childNode;
            }
            else{
                parentNode.right=childNode;
            }
            
        }
        
        for(int[] data:descriptions){
            if(!set.contains(data[0])){
                return map.get(data[0]);
            }
        }
        
        return null;
    }
}