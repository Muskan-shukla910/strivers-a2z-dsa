import java.util.*;

public class firstNegativeNumber {
    public static void main(String[] args) {
        List<Integer> ans = new ArrayList<>();
        boolean found = false;
        int k = 2;
        int arr[] = { 3, -4, -2, 1, -7, 9 };
        int n = arr.length;
        for (int i = 0; i < n - k + 1; i++) {
            for (int j = i; j < i + k; j++) {
                if (arr[j] < 0){
                    ans.add(arr[j]);
                found = true;
                break;
                }
            }
             if (!found)
            ans.add(0);
            
        }
        System.out.println(ans);
       

    }
}
