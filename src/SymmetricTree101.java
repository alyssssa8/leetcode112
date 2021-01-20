

public class SymmetricTree101 {

    public static void main(String[] args) {
        TreeNode tree7 = new TreeNode();
        tree7.val =3;
        tree7.left = null;
        tree7.right = null;

        TreeNode tree6 = new TreeNode();
        tree6.val = 4;
        tree6.left = null;
        tree6.right = null;

        TreeNode tree5 = new TreeNode();
        tree5.val =4;
        tree5.left = null;
        tree5.right = null;

        TreeNode tree4 = new TreeNode();
        tree4.val = 3;
        tree4.left = null;
        tree4.right = null;

        TreeNode tree3 = new TreeNode();
        tree3.val = 2;
        tree3.left = tree6;
        tree3.right = tree7;

        TreeNode tree2 = new TreeNode();
        tree2.val = 2;
        tree2.left = tree4;
        tree2.right = tree5;

        TreeNode tree1 = new TreeNode();
        tree1.val = 1;
        tree1.left = tree2;
        tree1.right = tree3;
        System.out.println(isSymmetric(tree1));

    }

    public static boolean isSymmetric(TreeNode root) {

       return isSymmeticCom(root, root);

    }

    public static boolean isSymmeticCom(TreeNode root1, TreeNode root2){
        if (root1 == null && root2==null){
            return true;
        }
        if (root1 == null || root2==null){
            return false;
        }
        if (root1.val != root2.val){
            return false;
        }
        return (isSymmeticCom(root1.left, root2.right) && isSymmeticCom(root1.right, root2.left));
    }
}
