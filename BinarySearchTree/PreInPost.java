public class PreInPost {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        // 3
        // / \
        // 4 2
        // / \ /\
        // -1 1 6 9
        Node a = new Node(3);
        Node b = new Node(4);
        Node c = new Node(2);
        Node d = new Node(-1);
        Node e = new Node(1);
        Node f = new Node(6);
        Node g = new Node(9);
        a.left=b; a.right=c;
        b.left=d; b.right=e;
        c.left=f; c.right=g;
        display(a);
        preOrder(a);
        // System.out.println(a);
        inOrder(a);
        // System.out.println(a);
        postOrder(a);
        // System.out.println(a);
        
    }
    private static void display(Node root){
        if(root==null) return;
        // System.out.println("Muskan");

        // System.out.print(root.left);
        // System.out.println(root.right);
        System.out.println(root.data);
        display(root.left);
        display(root.right);
    }
    public static void preOrder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
        // System.out.println();
    }  
    public static void inOrder(Node root){
        if(root==null) return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
        // System.out.println();
    }  
    public static void postOrder(Node root){
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
}
