import java.util.ArrayList;

public class doublyLinkedList {
    public static void main(String[] args) {
        ArrayList<ArrayList <Integer>> mainlist=new ArrayList<>();
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        mainlist.add(list);

        ArrayList<Integer>list2=new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(8);
        list2.add(10);

        ArrayList<Integer>list3=new ArrayList<>();
        list3.add(3);
        list3.add(6);
        list3.add(9);
        list3.add(12);
        list3.add(15);

        mainlist.add(list2);
        System.out.println(mainlist);
        for(int i=0;i<mainlist.size();i++){ 
            ArrayList<Integer>currList=mainlist.get(i);     //esse hamra pass poori list aayegi 
            for (int j = 0; j <currList.size(); j++) {
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
    }
}
