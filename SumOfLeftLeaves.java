class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) { val = x; }
}

public class SumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root) {
        return sumOfLeftLeaves(root, false);
    }
    
    private int sumOfLeftLeaves(TreeNode node, boolean isLeft) {
        if (node == null) {
            return 0;
        }
        
        if (node.left == null && node.right == null && isLeft) {
            return node.val;
        }
        
        int leftSum = sumOfLeftLeaves(node.left, true);
        int rightSum = sumOfLeftLeaves(node.right, false);
        
        return leftSum + rightSum;
    }
    
    public static void main(String[] args) {
       
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        
        SumOfLeftLeaves solution = new SumOfLeftLeaves();
        System.out.println("Sum of left leaves: " + solution.sumOfLeftLeaves(root)); 
    }
}
