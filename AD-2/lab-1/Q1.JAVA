class Q1{
    //node class
    class node{
        int data;
        node left;
        node right;

        public node(int data){
            data = this.data;
            left = right =null;
        }
    }

    //tree impliment
    class tree{
        node root;
        private Node addRecursive(node current, int value) {
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

        public void add(int value) {
            root = addRecursive(root,value);
        }

        public void print(node root){
            //printing the value 
            
        }
    }

    //main class or execution class
    public static void main(String[] args) {
        tree t = new tree;
        t.add(1,1);
        t.add(1,2);
        t.add(1,3);
        t.add(1,4);
        t.add(1,5);
        
    }
}