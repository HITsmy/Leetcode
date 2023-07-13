import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class One {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();


    }
}


/**
 * 二叉树专题
 */
//class Solution {  // p94 二叉树中序遍历
//    List<Integer> res = new ArrayList<>();
//    public List<Integer> inorderTraversal(TreeNode root) {
//        if(root != null) {
//            inorderTraversal(root.left);
//            res.add(root.val);
//            inorderTraversal(root.right);
//        }
//        return res;
//    }
//}


//class Solution {  // p95 不同的二叉搜索树2
//
//    public List<TreeNode> getTrees(int start, int end) {
//        List<TreeNode> res = new ArrayList<>();
//        if(start > end) {
//            res.add(null);
//            return res;
//        }
//        if(start == end) {
//            TreeNode node = new TreeNode(start);
//            res.add(node);
//            return res;
//        }
//
//        for(int mid=start; mid<=end; mid++) {
//            List<TreeNode> leftTrees = getTrees(start, mid-1);
//            List<TreeNode> rightTrees = getTrees(mid+1, end);
//            for(TreeNode leftTree : leftTrees) {
//                for(TreeNode rightTree : rightTrees) {
//                    TreeNode node = new TreeNode(mid);
//                    node.left = leftTree;
//                    node.right = rightTree;
//                    res.add(node);
//                }
//            }
//        }
//        return res;
//    }
//    public List<TreeNode> generateTrees(int n) {
//        List<TreeNode> res = getTrees(1, n);
//        return res;
//    }
//}

//class Solution {  // p98 验证二叉搜索树
//    private long pre_val = Long.MIN_VALUE;
//    public boolean isValidBST(TreeNode root) {
//        if(root == null)
//            return true;
//        if(!isValidBST(root.left))
//            return false;
//        if(pre_val >= root.val)
//            return false;
//        pre_val = root.val;
//        return isValidBST(root.right);
//    }
//}

