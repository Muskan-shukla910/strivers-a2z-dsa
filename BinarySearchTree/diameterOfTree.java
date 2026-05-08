public class diameterOfTree {
   static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }

    }
    public static int height(Node root){
        if(root==null) return 0;
        int lefth=height(root.left);
        int righth=height(root.right);
        return 1+Math.max(lefth, righth);
    }
    public static int dia(Node root){
        if(root==null) return 0;
       int leftdia=dia(root.left);
       int leftheight=height(root.left);
       int rightdia=dia(root.right);
       int rightHeight=height(root.right);
       int selfdia=leftheight+rightHeight+1;
        return Math.max(selfdia,Math.max(leftdia,rightdia));
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(6);
        root.right.left=new Node(7);
        root.right.right=new Node(8);
       int h= height(root);
       System.out.println(h);
      System.out.println( dia(root));
    }
}
