public class levelsOfBinaryTree {
    static class Node{
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
        Node b=new Node(1);
        Node c=new Node(2);
        Node d=new Node(3);
        Node e=new Node(4);
        Node f=new Node(7);
        // Cnnecting
        a.left=b;a.right=c;
        b.left=d; b.right=e;
        c.right=f;
        // 
        display(a);
        System.out.println(levels(a));

    }
    public static void display(Node root){
        if(root==null) return;
        System.out.println(root.data);
        display(root.left);
        display(root.right);

    }
    public static int levels(Node root){
        if(root==null) return 0;
        return 1+Math.max(levels(root.left),levels(root.right));
    }
}
