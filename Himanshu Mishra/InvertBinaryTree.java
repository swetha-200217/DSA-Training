import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
public class InvertBinaryTree {
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        // Swap the left and right children
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    public static void printTree(TreeNode root) {
        if (root != null) {
            printTree(root.left);
            System.out.print(root.val + " ");
            printTree(root.right);
        }
    }
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public static TreeNode createTreeFromInput(Scanner scanner) {
        System.out.println("Enter the root value: ");
        int rootValue = scanner.nextInt();
        TreeNode root = new TreeNode(rootValue);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.println("Enter left child of " + current.val + " (enter -1 for no child): ");
            int leftValue = scanner.nextInt();
            if (leftValue != -1) {
                current.left = new TreeNode(leftValue);
                queue.add(current.left);
            }
            System.out.println("Enter right child of " + current.val + " (enter -1 for no child): ");
            int rightValue = scanner.nextInt();
            if (rightValue != -1) {
                current.right = new TreeNode(rightValue);
                queue.add(current.right);
            }
        }
        return root;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeNode root = createTreeFromInput(scanner);
        System.out.println("Original Tree:");
        printTree(root);
        System.out.println();
        invertTree(root);
        System.out.println("Inverted Tree:");
        printTree(root);
    }
}
