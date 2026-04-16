public class preInPost{
    public static void main(String[] args){
        pip(3);
    }

    public static void pip(int n){
        if(n==0) return;
        System.out.print(" "+"pre"+n);  //pre   //1
        pip(n-1);  //0
        System.out.print(" "+"in"+n);   //in
        pip(n-1);  
        System.out.print( " "+"post"+" "+n);  //Post

    }
}