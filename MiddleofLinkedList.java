import java.util.Scanner;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MiddleofLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the elements of the linked list separated by spaces:");
        String[] elements = scanner.nextLine().split(" ");
        
        ListNode head = null, tail = null;

        for (String element : elements) {
            int value = Integer.parseInt(element);
            ListNode newNode = new ListNode(value);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        scanner.close();

        ListNode middleNode = findMiddle(head);
        if (middleNode != null) {
            System.out.println("The middle node value is: " + middleNode.val);
        } else {
            System.out.println("The linked list is empty.");
        }
    }

    public static ListNode findMiddle(ListNode head) {
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
}
