public class MaximumDepthofBinaryTree104 {
    public static void main(String[] args) {
        TreeNode tree5 = new TreeNode();
        tree5.val = 7;
        tree5.left = null;
        tree5.right = null;

        TreeNode tree4 = new TreeNode();
        tree4.val = 15;
        tree4.left = null;
        tree4.right = null;

        TreeNode tree3 = new TreeNode();
        tree3.val = 20;
        tree3.left = tree4;
        tree3.right = tree5;

        TreeNode tree2 = new TreeNode();
        tree2.val = 9;
        tree2.left = tree4;
        tree2.right = tree5;

        TreeNode tree1 = new TreeNode();
        tree1.val = 3;
        tree1.left = tree2;
        tree1.right = tree3;

        System.out.println(maxDepth(tree1));
    }

    public static int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }

        return Math.max (maxDepth(root.left), maxDepth(root.right)) +1;

    }
}
