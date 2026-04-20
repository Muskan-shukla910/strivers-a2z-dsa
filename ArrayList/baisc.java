import java.util.ArrayList;

public class baisc {
public static void main(String[] args) {
    ArrayList<Integer>list=new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    System.out.println(list);
    // int n=list.size();
    // for (int i = 5; i >0; i--) {
    //     System.out.println(i);
    // }

    // Reverse Print
    for (int i =list.size()-1; i>=0;  i--) {
        System.out.println(list.get(i));
    }
}    
}
