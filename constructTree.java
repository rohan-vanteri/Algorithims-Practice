package trees;


public class constructTree {

    public TreeNode overall(int[] nums){

        return helper(nums,0,nums.length-1);
    }

    public TreeNode helper(int[] A, int start, int end){
        if(start > end){
            return null;
        }
        if(start == end){
            return new TreeNode(A[start]);
        }

        int mid = start+end;
        mid = mid/2;

        TreeNode rootNode = new TreeNode(A[mid]);
        rootNode.left = helper(A,start,mid-1);
        rootNode.right = helper(A,mid+1,end);

        return rootNode;

    }
}
