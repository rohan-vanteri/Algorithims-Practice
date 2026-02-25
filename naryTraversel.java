package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class naryTraversel {
    public List<List<Integer>> narytraverse(TreeNode root, List<List<Integer>> result){
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null){
            return result;
        }

        q.add(root);
        while(!q.isEmpty()){
            int numnodes = q.size();
            List<Integer> templist = new ArrayList();
            int count = 0;
            while(count < numnodes){
                TreeNode node = q.remove();
                templist.add(node.key);
                for(TreeNode child: node.children){
                    if(child.left != null){
                        q.add(node.left);
                    }
                    if(child.right != null){
                        q.add(node.right);
                    }
                }
                count++;
            }
            result.add(templist);
        }

        return result;
    }

}
