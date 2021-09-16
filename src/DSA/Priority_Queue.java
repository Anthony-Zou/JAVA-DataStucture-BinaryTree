package DSA;
import java.util.Comparator;
import java.util.PriorityQueue;

 class Priority_Queue {
    public static void main(String[] args) {
        Comparator<String> comparator = new StringLengthComparator();
        PriorityQueue<String> queue = new PriorityQueue<String>(10, comparator);
        queue.add("short");
        queue.add("very long indeed");
        queue.add("medium");
        while (queue.size() != 0) {
            System.out.println(queue.remove());
        }
    }
}

// StringLengthComparator.java


 class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String x, String y) {
        // Assume neither string is null. Real code should
        // probably be more robust
        // You could also just return x.length() - y.length(),
        // which would be more efficient.
        if (x.length() < y.length()) {
            return -1;
        }
        if (x.length() > y.length()) {
            return 1;
        }
        return 0;
    }
}

/*475

Use the constructor overload which takes a Comparator<? super E> comparator and pass in a comparator which
compares in the appropriate way for your sort order. If you give an example of how you want to sort,
we can provide some sample code to implement the comparator if you're not sure. (It's pretty straightforward though.)

As has been said elsewhere: offer and add are just different interface method implementations.
In the JDK source I've got, add calls offer. Although add and offer have potentially different behaviour in
general due to the ability for offer to indicate that the value can't be added due to size limitations,
this difference is irrelevant in PriorityQueue which is unbounded.
*/
/*A priority queue is a special type of queue in which each element is associated with a priority value.
 And, elements are served on the basis of their priority. That is, higher priority elements are served first.
 However, if elements with the same priority occur, they are served according to their order in the queue.*/

/*Assigning Priority Value

Generally, the value of the element itself is considered for assigning the priority. For example,

The element with the highest value is considered the highest priority element.
However, in other cases, we can assume the element with the lowest value as the highest priority element.

We can also set priorities according to our needs.*/

/*Difference between Priority Queue and Normal Queue
In a queue, the first-in-first-out rule is implemented whereas, in a priority queue, the values are removed on the basis of priority.
The element with the highest priority is removed first.*/
/*Implementation of Priority Queue
Priority queue can be implemented using an array, a linked list, a heap data structure,
or a binary search tree. Among these data structures, heap data structure provides an efficient implementation of priority queues.

Hence, we will be using the heap data structure to implement the priority queue in this tutorial.
A max-heap is implement is in the following operations. */

/*
Operations	    peek	    insert	        delete
Linked List	        O(1)	O(n)	    O(1)
Binary Heap	        O(1)	O(log n)	O(log n)
Binary Search Tree	O(1)	O(log n)	O(log n)
*/