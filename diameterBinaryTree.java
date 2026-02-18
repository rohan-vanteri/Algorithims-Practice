package trees;

public class diameterBinaryTree {
    int largestPath = 0;

    public int findDiameter(TreeNode root){
        if(root == null){
            return 0;
        }
        helper(root);

        return largestPath;
    }

    public int helper(TreeNode node){
        if(node.left == null && node.right == null){
            return 0;
        }

        int left_height = 0;
        int right_height = 0;
        int mydia = 0;

        if(node.left != null){
            left_height = helper(node.left);
            mydia = left_height+1;
        }

        if(node.right != null){
            right_height = helper(node.right);
            mydia = right_height+1;
        }
        if(mydia > largestPath){
            largestPath = mydia;
        }
        return Math.max(left_height,right_height)+1;
    }
}

