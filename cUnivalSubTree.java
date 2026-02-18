package trees;

public class cUnivalSubTree {

    public int numTrees = 0;

    public int countUni(TreeNode root){

        if(root == null){
            return 0;
        }
        helper(root);
        return numTrees;
    }

    public boolean helper(TreeNode node){
        if(node.left == null & node.right == null){
            numTrees++;
            return true;
        }

        boolean amIUnival = true;

        if(node.left!=null){
            boolean bl = helper(node.left);
            if(!bl || node.val != node.left.val){
                amIUnival = false;
            }
        }

        if(node.right != null){
            boolean br = helper(node.right);
            if(!br || node.val != node.right.val){
                amIUnival = false;
            }
        }

        if(amIUnival){
            numTrees++;
        }

        return amIUnival;
    }
}
