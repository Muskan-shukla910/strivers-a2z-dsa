public class MergeSortedArray {
    public static int search(int arr[],int traget,int si,int ei){
        if(si>ei){
            return -1;
        }
        int mid=si+(ei-si)/2;
        // case 1 found 
        if(arr[mid]==traget){
            return mid;
        }
        // if()
        // Mid on Line 1
        if(arr[si]<=arr[mid]) {
            // case a : (left) 
            if(arr[si]<=traget  && traget<=arr[mid]){
                return search(arr, traget, si, mid-1);
            }
            else{
                // case b : right
              return  search(arr, traget, mid+1, ei);
            }
        }

        // Mid on Line 2
        if(arr[mid]<=ei){
            if(arr[mid]<traget &&  traget<=arr[ei]){
                return search(arr, traget, mid+1, ei);
            }
            else{
                return search(arr, traget, si, mid-1);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int traget=0;
       int targetIdx= search(arr, traget,0,arr.length-1);
       System.out.println(targetIdx);
    //    printArr(arr);

    }
    public static void printArr(int arr[]){
        System.out.println(arr);
    }
}
