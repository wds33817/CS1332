import java.util.*;

/**
 * Your implementation of the pre-order, in-order, and post-order
 * traversals of a tree.
 */
public class Traversals<T extends Comparable<? super T>> {

    /**
     * DO NOT ADD ANY GLOBAL VARIABLES!
     */

    /**
     * Given the root of a binary search tree, generate a
     * pre-order traversal of the tree. The original tree
     * should not be modified in any way.
     *
     * This must be done recursively.
     *
     * Must be O(n).
     *
     * @param <T> Generic type.
     * @param root The root of a BST.
     * @return List containing the pre-order traversal of the tree.
     */
    public List<T> preorder(TreeNode<T> root) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        Stack<TreeNode> nodeStack = new Stack<>();
        List<T> res = new ArrayList<>();
        if (root == null || root.getData() == "") {
            return res;
        }
        nodeStack.push(root);
        while (!nodeStack.isEmpty()) {
            TreeNode node = nodeStack.peek();
            res.add((T) nodeStack.pop().getData());
            if (node.getRight() != null) {
                nodeStack.push(node.getRight());
            }
            if (node.getLeft() != null) {
                nodeStack.push(node.getLeft());
            }
        }
        return res;
    }

    /**
     * Given the root of a binary search tree, generate an
     * in-order traversal of the tree. The original tree
     * should not be modified in any way.
     *
     * This must be done recursively.
     *
     * Must be O(n).
     *
     * @param <T> Generic type.
     * @param root The root of a BST.
     * @return List containing the in-order traversal of the tree.
     */
    public List<T> inorder(TreeNode<T> root) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        Stack<TreeNode> nodeStack = new Stack<>();
        List<T> res = new ArrayList<>();
        if (root == null || root.getData() == "") {
            return res;
        }
        TreeNode node = root;
        while (node != null || !nodeStack.isEmpty()) {
            if (node != null) {
                nodeStack.push(node);
                node = node.getLeft();
            } else {
                TreeNode tmp = nodeStack.pop();
                res.add((T) tmp.getData());
                node = tmp.getRight();
            }
        }
        return res;
    }

    /**
     * Given the root of a binary search tree, generate a
     * post-order traversal of the tree. The original tree
     * should not be modified in any way.
     *
     * This must be done recursively.
     *
     * Must be O(n).
     *
     * @param <T> Generic type.
     * @param root The root of a BST.
     * @return List containing the post-order traversal of the tree.
     */
    public List<T> postorder(TreeNode<T> root) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        List<T> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        Stack<TreeNode> output = new Stack<>();
        if (root == null || root.getData() == "") {
            return res;
        }
        TreeNode node = root;
        while ((node != null) || !stack.isEmpty()) {
            if (node != null) {
                output.push(node);
                stack.push(node);
                node = node.getRight();
            } else {
                node = stack.pop();
                node = node.getLeft();
            }
        }

        while(output.size() > 0) {
            node = output.pop();
            res.add((T) node.getData());
        }

        return res;
    }
}