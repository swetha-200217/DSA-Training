import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedList {
    public ListNode findMiddleNode(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of nodes in the linked list:");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("The list is empty.");
            scanner.close();
            return;
        }

        System.out.println("Enter the values of the nodes:");
        ListNode head = new ListNode(scanner.nextInt());
        ListNode current = head;

        for (int i = 1; i < n; i++) {
            current.next = new ListNode(scanner.nextInt());
            current = current.next;
        }

        LinkedList list = new LinkedList();
        ListNode middleNode = list.findMiddleNode(head);
        System.out.println("The middle node value is: " + middleNode.val);
    }
}