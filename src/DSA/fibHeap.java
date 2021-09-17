package DSA;

//Operation on Fibonacci Heap in Java
class node {
    node parent;
    node left;
    node right;
    node child;
    int degree;
    boolean mark;
    int key;

    public node() {
        this.degree = 0;
        this.mark = false;
        this.parent = null;
        this.left = this;
        this.right = this;
        this.child = null;
        this.key = Integer.MAX_VALUE;
    }

    node(int x) {
        this();
        this.key = x;
    }

    void set_pparent(node x) {
        this.parent = x;
    }

    node get_parent() {
        return this.parent;
    }

    void set_left(node x) {
        this.left = x;
    }

    node get_left() {
        return this.left;
    }

    void set_right(node x) {
        this.left = x;
    }

    node get_right() {
        return this.right;
    }

    void set_child(node x) {
        this.child = x;
    }

    void set_degree(int x) {
        this.degree = x;
    }

    int get_degree() {
        return this.degree;
    }

    void set_mark(boolean m) {
        this.mark = m;
    }

    boolean get_mark() {
        return this.mark;
    }

    void set_key(int x) {
        this.key = x;
    }

    int get_key() {
        return this.key;
    }
}

public class fibHeap {
    node min;
    int n;
    boolean trace;
    node found;

    public boolean get_trace(){return trace;}
    public void set_trace(boolean t){
        this.trace = t;
    }
    public static fibHeap create_heap(){
        return new fibHeap();
    }

    fibHeap(){
        min = null;
        n=0;
        trace = false;
    }

    
}
