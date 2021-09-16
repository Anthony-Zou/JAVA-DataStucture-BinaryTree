package DSA;


public class LinkedList {
    //Creating a node
    Node head;
    static class Node{
        int value;
        Node next;
        Node(int d){
            value = d;
            next = null;
        }
    }

    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();
        //Assign values
        linkedList.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        //Connect Nodes
        linkedList.head.next = second;
        second.next = third;

        //printing node-value
        while(linkedList.head != null)
        {
            System.out.print(linkedList.head.value+" ");
            linkedList.head = linkedList.head.next;
        }
    }


}

/*
* Linked List Complexity
Time Complexity

 	    Worst case	    Average Case
Search	    O(n)	    O(n)
Insert	    O(1)	    O(1)
Deletion	O(1)	    O(1)
Space Complexity: O(n)
* */

/*
Linked List Applications
Dynamic memory allocation
Implemented in stack and queue
In undo functionality of softwares
Hash tables, Graphs
*/
