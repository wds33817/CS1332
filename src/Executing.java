public class Executing {
    public static void main(String[] args) {
        //TreeNode<Integer> root = new TreeNode<Integer>(null);


        TreeNode<Integer> root = new TreeNode<Integer>(5);
        TreeNode<Integer> root1 = new TreeNode<Integer>(4);
        TreeNode<Integer> root2 = new TreeNode<Integer>(7);
        TreeNode<Integer> root3 = new TreeNode<Integer>(1);
        TreeNode<Integer> root4 = new TreeNode<Integer>(9);
        TreeNode<Integer> root5 = new TreeNode<Integer>(0);
        TreeNode<Integer> root6 = new TreeNode<Integer>(2);
        TreeNode<Integer> root7 = new TreeNode<Integer>(8);
        root.setLeft(root1);
        root.setRight(root2);
        root1.setLeft(root3);
        root2.setRight(root4);
        root3.setLeft(root5);
        root3.setRight(root6);
        root4.setLeft(root7);



        Traversals<Integer> trv = new Traversals<>();
        System.out.println(trv.postorder(root));
    }
}
