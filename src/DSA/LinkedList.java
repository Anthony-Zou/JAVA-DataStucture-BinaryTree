package DSA;

public class LinkedList {
    //Creating a DSA.node
    Node head;

    static class Node {
        int value;
        Node next;

        Node(int d) {
            value = d;
            next = null;
        }
    }

    //Insert at begainning
    public void insertAtBegainning(int new_data) {
        // insert the data
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    // Insert after a DSA.node
    public void insertAfter(Node prev_node, int new_data) {
        if (prev_node == null) {
            System.out.println("The given previous noded cannot be null");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = new Node(new_data);
        prev_node.next = new_node;
    }

    //Insert at the end
    public void insertAtEnd(int new_data) {
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new Node(new_data);
            return;
        }

        new_node.next = null;
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = new_node;
        return;
    }

    //Delete a DSA.node
    void deleteNode(int position) {
        if (head == null) {
            return;
        }
        Node temp = head;
        if (position == 0) {
            head = temp.next;
            return;
        }
        //Find the key to be deleted
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }
        //If the key is not present
        if (temp == null || temp.next == null) {
            return;
        }

        //Remove the DSA.node
        Node next = temp.next.next;

        temp.next = next;

    }

    //Search a DSA.node
    boolean search(Node head, int key) {
        Node current = head;
        while (current != null) {
            if (current.value == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    //Sort the linked list
    void sortLinkedList(Node head) {
        Node current = head;
        Node index = null;
        int temp;

        if (head == null) {
            return;
        } else {
            while (current != null) {
                // index points to the DSA.node next to current
                index = current.next;

                while (index != null) {
                    if (current.value > index.value) {
                        temp = current.value;
                        current.value = index.value;
                        index.value = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    // Print the linked list
    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.println(tnode.value + " ");
            tnode = tnode.next;
        }
    }


    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.insertAtEnd(1);
        llist.insertAtBegainning(2);
        llist.insertAtBegainning(3);
        llist.insertAtEnd(4);
        llist.insertAfter(llist.head.next, 5);

        System.out.println("\n After deleting an element: ");
        llist.deleteNode(3);
        llist.printList();

        System.out.println();
        int item_to_find = 3;
        if(llist.search(llist.head, item_to_find))
        {System.out.println(item_to_find+" is found");}
        else
        {
            System.out.println(item_to_find+ " is not found");
        }
        llist.sortLinkedList(llist.head);
        System.out.println("\nSorted List: ");
        llist.printList();
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
