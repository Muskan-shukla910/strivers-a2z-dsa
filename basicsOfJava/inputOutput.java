import java.math.BigInteger;
import java.util.Scanner;

public class inputOutput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your first Number :");
        int firstNo=sc.nextInt();
        System.out.print("Enter Your Secound Number :");
        int SecoundNo=sc.nextInt();
        int add=firstNo+SecoundNo;
        System.out.println("Addition of two nunbers is :"+add);


        BigInteger bg=sc.nextBigInteger();
       System.out.println("big number "+bg);

    //    System.out.println("Enter the value of flag");
       boolean flag=sc.nextBoolean();
       System.out.println(flag);
       sc.close();

    }
    
}
