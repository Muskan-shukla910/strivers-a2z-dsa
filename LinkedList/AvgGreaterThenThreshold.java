public class AvgGreaterThenThreshold {
    public static void main(String[] args) {
        int sum=0; int k=3; int threshold = 4;
        int maxSum=Integer.MIN_VALUE;
        int i=0; int j=0;
        double avg;
        int cnt=0;
        int arr[]={2,2,2,2,5,5,5,8};
        int n=arr.length;
        while (j<n) {
            sum=sum+arr[j];
            if((j-i+1)<k){
                j++;
            }
            else if((j-i+1)==k){
                maxSum=Math.max(maxSum, sum);
                avg=(double) maxSum/k;
                sum=sum-arr[i];
                i++; j++;
            } 
            else if(avg>=threshold){
                cnt++;
            }           
        }
        System.out.println(cnt);
    }
}
