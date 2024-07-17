class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
public class LowestCommonAncestor {
    private TreeNode root;
    public LowestCommonAncestor(TreeNode root) {
        this.root = root;
    }
    public TreeNode lowestCommonAncestor(TreeNode p, TreeNode q) {
        return findLCA(root, p, q);
    }
    private TreeNode findLCA(TreeNode node, TreeNode p, TreeNode q) {
        if (node == null || node == p || node == q) {
            return node;
        }
        TreeNode left = findLCA(node.left, p, q);
        TreeNode right = findLCA(node.right, p, q);
        if (left != null && right != null) {
            return node;
        }
        return left != null ? left : right;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        LowestCommonAncestor solution = new LowestCommonAncestor(root);
        TreeNode p = root.left.right;
        TreeNode q = root.right.left;
        TreeNode lca = solution.lowestCommonAncestor(p, q);
        System.out.println("Lowest Common Ancestor: " + lca.val);
    }
}

