import java.util.ArrayList;
import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 1, 5, 2, 6, 4 };
        int n = arr.length;
        int high = n - 1;
        System.out.println("Before Sorting: " + Arrays.toString(arr));
        MergeSort(arr, 0, high);
        System.out.println("After Sorting: " + Arrays.toString(arr));
        // Memory address
        // System.out.println(arr);
    }

    public static void MergeSort(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        MergeSort(arr, low, mid); // sort left
        MergeSort(arr, mid + 1, high); // Sort right
        Merge(arr, low, mid, high); // Merge the sorted halves
    }

    public static void Merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low; // starting index of left half
        int right = mid + 1; // starting index of right half

        
        while (left <= mid && right <= high) {

            // if left side small element add here
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            }
            // if right side elements smaller
             else {
                temp.add(arr[right]);
                right++;
            }
        }
        // If elements on the left half are remaining
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }
        // If elements on the right half are remaining
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }
        // Transferring all elements from temp back to the original array
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }
}
