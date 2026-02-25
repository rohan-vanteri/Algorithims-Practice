package trees;

public class pathSum {
    public static void main(String[] args) {

    }

    public boolean pathsum(TreeNode root, int targetSum){

        if (root == null){
            return false;
        }
        boolean[] box = new boolean[1];
        helper(root,targetSum,box);

        return box[0];
    }

    public void helper(TreeNode node, int target,boolean[] box){

        if(node.left == null && node.right == null){
            if(target == (int) node.val){
                box[0] = true;
            }
        }

        if(node.left != null){
            helper(node.left,target- (int) node.val,box);
        }

        if(node.right != null){
            helper(node.right,target- (int) node.val,box);
        }
    }
}
