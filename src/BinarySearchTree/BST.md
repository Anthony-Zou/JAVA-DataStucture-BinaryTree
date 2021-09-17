### BINARY Search tree(BST)
Binary search tree is a data structure that quickly allows us to maintain a sorted list of numbers.

- It is called a binary tree because each tree node has a maximum of two children.
- It is called a search tree because it can be used to search for the presence of a number in O(log(n)) time.

The properties that seperate a binary search tree from a regular binary tree is
1. All nodes of the left subtree are less than the root node
2. All nodes of the t=right subtree are more  tahn the root node
3. Both subtrees of each node are also BST

### Insertion Algorithm
```
If root == NULL 
    return NULL;
If number == root->data 
    return root->data;
If number < root->data 
    return search(root->left)
If number > root->data 
    return search(root->right)
```
    
Binary Search Tree Complexities
Time Complexity
|Operation|	Best Case Complexity	|Average Case Complexity	|Worst Case Complexity|
|-----------|--------------------|----------------------------|----------------------|
|Search	    |O(log n)|	O(log n)	|O(n)|
|Insertion	|O(log n)|  O(log n)	|O(n)|
|Deletion	|O(log n)|	O(log n)	|O(n)|
Here, n is the number of nodes in the tree.

Space Complexity
The space complexity for all the operations is O(n).

Binary Search Tree Applications
1. In multilevel indexing in the database
2. For dynamic sorting
3. For managing virtual memory areas in Unix kernel