public class DiameterOfBinaryTree543 {
//
//    private int max1 = 0;
    public static class  TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
      }

    public static void main(String[] args) {
        TreeNode tree5 = new TreeNode();
        tree5.val = 5;
        tree5.left = null;
        tree5.right = null;

        TreeNode tree4 = new TreeNode();
        tree4.val = 4;
        tree4.left = null;
        tree4.right = null;


        TreeNode tree3 = new TreeNode();
        tree3.val = 3;
        tree3.left = null;
        tree3.right = null;

        TreeNode tree2 = new TreeNode();
        tree2.val = 2;
        tree2.left = tree3;
        tree2.right = tree4;

        TreeNode tree1 = new TreeNode();
        tree1.val = 1;
        tree1.left = tree2;
        tree1.right = tree3;




        diameterOfBinaryTree(tree1);
    }
    private static int  max = 0;
    public static int diameterOfBinaryTree(TreeNode root) {

        depth(root);
        return max;

    }

    private static int depth(TreeNode root){
        if (root  == null){
            return 0;
        }
        int left = depth(root.left);
        int right  = depth(root.right);
        max= Math.max(max, left  + right);

        return Math.max(left,right) + 1;
    }
}
