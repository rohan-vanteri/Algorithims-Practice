package trees;

import java.util.List;

public class TreeNode {
    int key;
    Object val;
    TreeNode left;
    TreeNode right;
    List<TreeNode> children;
    public TreeNode(int k){
        this.key=k;
        this.left=null;
        this.right=null;
        this.val =null;
    }

}
