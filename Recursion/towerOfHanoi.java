public class towerOfHanoi {
    public static void main(String[] args) {
        hanoi(3,'A','B','C');
    }
    private static void hanoi(int n,char src,char helper,char dest){
         // base case 
        if(n==0) return;
        hanoi(n-1, src, dest, helper);   //n-1 disks from A to B via C
        System.out.println(src+"->"+dest); // largest A to C
        hanoi(n-1, helper,src, dest);    // n-1 disks from B to C via A
    }
}
