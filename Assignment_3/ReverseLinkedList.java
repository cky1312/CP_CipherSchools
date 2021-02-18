package Assignment_3;
public class ReverseLinkedList {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node reverse(Node n) {
        Node prev = null;
        Node current = n;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        n = prev;
        return n;
    }

    void printList(Node n) {
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        ReverseLinkedList list = new ReverseLinkedList();
        ReverseLinkedList.head = new Node(85);
        ReverseLinkedList.head.next = new Node(15);
        ReverseLinkedList.head.next.next = new Node(4);
        ReverseLinkedList.head.next.next.next = new Node(20);
 
        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);

        // sc.close();
    }
    
}
