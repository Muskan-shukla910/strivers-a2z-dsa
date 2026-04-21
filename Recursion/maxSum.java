public class maxSum {
    public static void main(String[] args) {
        int arr[]={3,7,2,9,5};
        int target=9;
        // int indx=0;
        int res=Sum(arr,target,0);
        System.out.println(res);
        
    }

    public static int Sum(int[] arr, int target,int indx ){
        if(indx==arr.length){
            return -1;
        };
        if(arr[indx]==target){
            return indx;
        }

      return  Sum(arr, target, indx+1);
    }
}
