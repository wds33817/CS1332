import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Practice<T extends Comparable<? super T>> {

    public List<T> levelOrder(TreeNode<T> root) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        Queue<TreeNode> queue = new LinkedList<>();
        List<T> res = new ArrayList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode tmp = queue.poll();
            res.add((T) tmp.getData());
            if (tmp.getLeft() != null) {
                queue.add(tmp.getLeft());
            }
            if (tmp.getRight() != null) {
                queue.add(tmp.getRight());
            }
        }
        return res;
    }
}
