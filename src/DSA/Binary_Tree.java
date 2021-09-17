package DSA;// Checking if a binary tree is a full binary tree in Java
class Node {
    int key;
    Node left, right;
    public Node(int item) {
        key = item;
        left = right = null;}}
class BinaryTree {
    Node root;
    BinaryTree(int key) {
        root = new Node(key);
    }
    BinaryTree() {
        root = null;
    }
    // Traverse Inorder
    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.key);
            traverseInOrder(node.right);
        }
    }
    // Traverse Postorder
    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.key);
        }
    }
    // Traverse Preorder
    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.key);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    // Check for Full Binary Tree
    boolean isFullBinaryTree(Node node) {

        // Checking tree emptiness
        if (node == null)
            return true;

        // Checking the children
        if (node.left == null && node.right == null)
            return true;

        if ((node.left != null) && (node.right != null))
            return (isFullBinaryTree(node.left) && isFullBinaryTree(node.right));

        return false;
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(2);
        tree.root.left = new Node(3);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        System.out.print("Pre order Traversal: ");
        tree.traversePreOrder(tree.root);
        System.out.print("\nIn order Traversal: ");
        tree.traverseInOrder(tree.root);
        System.out.print("\nPost order Traversal: ");
        tree.traversePostOrder(tree.root);
        if (tree.isFullBinaryTree(tree.root))
            System.out.print("The tree is a full binary tree");
        else
            System.out.print("The tree is not a full binary tree");}
}