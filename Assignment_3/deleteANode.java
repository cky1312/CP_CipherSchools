package Assignment_3;


public class deleteANode {

    static N head;

    static class N {
        int data;
        N next;

        N(int d) {
            data = d;
            next = null;
        }
    }

    void deleteNode(int key) {
        N temp = head, prev = null;

        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null)
            return;

        prev.next = temp.next;
    }

    public void printList() {
        N tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }

    public static void main(String[] args) {

        deleteANode dn = new deleteANode();

        dn.head = new N(5);
        dn.head.next = new N(3);
        dn.head.next.next = new N(8);
        dn.head.next.next.next = new N(6);
        dn.head.next.next.next.next = new N(1);
        dn.head.next.next.next.next.next = new N(9);

        System.out.println("Created Linked List is:");

        dn.printList();

        System.out.println("Linked List after deletion of a node:");

        dn.deleteNode(1);
        dn.printList();

    }
}
