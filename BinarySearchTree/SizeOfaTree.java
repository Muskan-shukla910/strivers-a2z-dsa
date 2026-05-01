public class SizeOfaTree {
    static class Node {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }    
    }
    public static void main(String[] args) {
        Node a=new Node(0);
        Node b=new Node(2);
        Node c=new Node(5);
        // Node d=new Node(6);
        // Node e=new Node(7);
        // Connecting
        a.left=b; a.right=c;
        // b.left=d; b.right=e;
        // Printing
        display(a);
        int s=size(a);
        System.out.println(s);
    }
    public static int size(Node root){
        if(root==null) return 0;
        int leftSize=size(root.left);
        int rightSize=size(root.right);
        return 1+leftSize+rightSize;
    }
    public static void display(Node root){
        if(root==null) return;
        System.out.println(root.data);
        display(root.left);
        display(root.right);
    }
}
