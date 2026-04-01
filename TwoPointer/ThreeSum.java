package TwoPointer;

public class ThreeSum {
    public static void main(String[] args) {
        
        int arr[]={-4,-1,-1,0,1,2};
       
        for (int i = 0; i < arr.length; i++) {
             int right=arr.length-1;
             int left=i+1;;
            int sum=arr[i]+arr[left]+arr[right];
            
            if(sum>0){
                right--;
            }
            else if(sum<0){
                left++;
            }
            else if(sum== 0){
                
            }
    }
}
