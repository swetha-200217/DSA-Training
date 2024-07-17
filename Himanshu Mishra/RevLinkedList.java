public class RevLinkedList {
    Node head;
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
    public static void main(String[] args) {
        RevLinkedList list = new RevLinkedList();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        System.out.println("Original List:");
        list.printList();
        list.reverse();
        System.out.println("\nReversed List:");
        list.printList();
    }
}
