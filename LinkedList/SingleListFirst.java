class Node{
    int val;
    Node next;

    Node(int val,Node next){
        this.val=val;
        this.next=next;        
    }
}

public class SingleListFirst{
    public static void main(String[] args){
         Node a=new Node(1);   //a.val=1;
        Node b=new Node(22);    //b.val=11;
        Node c=new Node(12);    //c.val=12;
        Node d=new Node(13);    //d.val=13;
        Node e=new Node(14);    //e.val=14;
        System.out.print(a.next);
        System.out.print(b.next);
        // Now we are connecting With List

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

    }
}