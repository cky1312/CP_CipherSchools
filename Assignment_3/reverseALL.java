package Assignment_3;

public class reverseALL {

    static Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    Node reverse(Node head){
        Node prev = null, next = null, current;
        current = head;
        while(current != null){
            next = current.next;
            current.next = prev;

            prev = current;
            current = next; 
        }
        head = prev;
        return head;
    }

    void dispaly(Node head){
        while(head != null){
            System.out.print(head.data+"->");
            head = head.next;
        }
    }
    public static void main(String[] args) {
        reverseALL dn = new reverseALL();
        dn.head = new Node(5);
        dn.head.next = new Node(3);
        dn.head.next.next = new Node(8);
        dn.head.next.next.next = new Node(6);
        dn.head.next.next.next.next = new Node(1);
        dn.head.next.next.next.next.next = new Node(9);

        System.out.println("Linked List before reversal:");
        dn.dispaly(head);
        System.out.println();
        head = dn.reverse(head);
        System.out.println("Linked List after reversal:");
        dn.dispaly(head);
    }
}
