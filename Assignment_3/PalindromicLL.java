package Assignment_3;

import java.util.Stack;

public class PalindromicLL {

    static Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }

    static boolean isPalindrome(Node nn){
        Stack<Integer> s  =new Stack<>();
        Node n = nn;
        while(n != null){
            s.push(n.data);
            n = n.next;
        }

        boolean b = true;
        while(nn != null){
            int i = s.pop();
            if(nn.data == i)
                b = true;
            else{
                b = false;
                break;
            }

            nn = nn.next;
        }
        return b;
    }


    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(3);
        Node six = new Node(2);
        Node seven = new Node(1);
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = seven;
        boolean res = isPalindrome(one);
        System.out.println("isPalidrome :" + res);
    }
    
}
