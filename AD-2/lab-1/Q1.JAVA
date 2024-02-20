class Node{
    int value;
    Node left;
    Node right;


    public Node(int data){
        data = this.value;
        left = right =null;
    }
}

//tree impliment
class tree{
    Node root;
    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            return current;
        }

        return current;
    }

    public void add(int value, int i) {
        root = addRecursive(root,value);
    }

    public void print(Node root){
        //printing the value

    }
}
class Q1{
    //node class

    //main class or execution class
    public static void main(String[] args) {
        tree t=new tree();
        t.add(1,1);
        t.add(1,2);
        t.add(1,3);
        t.add(1,4);
        t.add(1,5);
        
    }
}