package Assignment_3;
// class Node {
//     int data;
//     Node next;

//     Node(int d) {
//         data = d;
//         next = null;
//     }
// }

// class Merge2SortedLL {

//      Node head;

//     public void addToLast(Node node) {
//         if (head == null) {
//             head = node;
//         } else {
//             Node temp = head;
//             while (temp.next != null) {
//                 temp = temp.next;
//             }
//             temp.next = node;
//         }
//     }

        

//     void display() {
//         Node t = head;
//         while (t != null) {
//             System.out.print(t.data + "->");
//             t = t.next;
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         try{

//         Merge2SortedLL llist1 = new Merge2SortedLL();
//         Merge2SortedLL llist2 = new Merge2SortedLL();

//         // Node head1 = new Node(5);
//         llist1.addToLast(new Node(5));
//         llist1.addToLast(new Node(10));
//         llist1.addToLast(new Node(15));

//         // Node head2 = new Node(2);
//         llist2.addToLast(new Node(2));
//         llist2.addToLast(new Node(3));
//         llist2.addToLast(new Node(20));
//         llist1.head = new gfg().sortedMerge(llist1.head, llist2.head);
//         llist1.display();
//         System.out.println("Called");
//         }
//         catch(Exception e){

//         }
//     }
// }
// class gfg{
//     Node sortedMerge(Node head1, Node head2) {
//         Node ptr1 = head1;
//         Node ptr2 = head2;
//         Node dummy = new Node(0);
//         Node ptr3 = dummy;

//         while (ptr1 != null || ptr2 != null) {
//             if (ptr1.data < ptr2.data) {
//                 ptr3.next = ptr1;
//                 ptr1 = ptr1.next;
//             } else {
//                 ptr3.next = ptr2;
//                 ptr2 = ptr2.next;
//             }
//             ptr3 = ptr3.next;
//         }

//         while (ptr1.next != null) {
//             ptr3.next = ptr1;
//             ptr1 = ptr1.next;
//             ptr3 = ptr3.next;
//         }

//         while (ptr2.next != null) {
//             ptr3.next = ptr1;
//             ptr2 = ptr2.next;
//             ptr3 = ptr3.next;
//         }

//         return dummy.next;
//     }
// }

import java.util.*;
 
/* Link list node */
class Node 
{
    int data;
    Node next;
    Node(int d) {data = d;
                 next = null;}
}
     
class MergeLists 
{
Node head; 
 
/* Method to insert a node at 
   the end of the linked list */
public void addToTheLast(Node node) 
{
    if (head == null)
    {
        head = node;
    }
    else
    {
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = node;
    }
}
 
/* Method to print linked list */
void printList()
{
    Node temp = head;
    while (temp != null)
    {
        System.out.print(temp.data + " ");
        temp = temp.next;
    } 
    System.out.println();
}
 
 
// Driver Code
public static void main(String args[])
{
    /* Let us create two sorted linked
       lists to test the methods 
       Created lists:
           llist1: 5->10->15,
           llist2: 2->3->20
    */
    MergeLists llist1 = new MergeLists();
    MergeLists llist2 = new MergeLists();
     
    // Node head1 = new Node(5);
    llist1.addToTheLast(new Node(5));
    llist1.addToTheLast(new Node(10));
    llist1.addToTheLast(new Node(15));
     
    // Node head2 = new Node(2);
    llist2.addToTheLast(new Node(2));
    llist2.addToTheLast(new Node(3));
    llist2.addToTheLast(new Node(20));
     
     
    llist1.head = new Gfg().sortedMerge(llist1.head, 
                                        llist2.head);
    llist1.printList();     
     
}
}
 
class Gfg
{
/* Takes two lists sorted in 
increasing order, and splices 
their nodes together to make 
one big sorted list which is 
returned. */
Node sortedMerge(Node headA, Node headB)
{
     
    /* a dummy first node to 
       hang the result on */
    Node dummyNode = new Node(0);
     
    /* tail points to the 
    last result node */
    Node tail = dummyNode;
    while(true) 
    {
         
        /* if either list runs out, 
        use the other list */
        if(headA == null)
        {
            tail.next = headB;
            break;
        }
        if(headB == null)
        {
            tail.next = headA;
            break;
        }
         
        /* Compare the data of the two
        lists whichever lists' data is 
        smaller, append it into tail and
        advance the head to the next Node
        */
        if(headA.data <= headB.data)
        {
            tail.next = headA;
            headA = headA.next;
        } 
        else
        {
            tail.next = headB;
            headB = headB.next;
        }
         
        /* Advance the tail */
        tail = tail.next;
    }
    return dummyNode.next;
}
}