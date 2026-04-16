public class MaxSubarraySum {
    public static void main(String[] args) {
        int sum=0;int maxsum=Integer.MIN_VALUE;
        int i=0; int j=i;
        int nums[] = {1,12,-5,-6,50,3}; int k = 4;  
        double avg=0.0;
        int n=nums.length;
        while(j<n){
            // STEP 1: Always add the incoming element to the sum first
            sum=sum+nums[j];
            // STEP 2: If window size is less than k, just expand the window
            if((j-i+1)<k){
                j++;
            }
            // STEP 3: If window size exactly matches k
            else if((j-i+1)==k){
                // Update the maximum sum found so far
                maxsum=Math.max(maxsum, sum);
                avg=(double) maxsum/k;
                // Subtract the element that is leaving the window
                sum = sum - nums[i];

                // Slide the window forward
                j++;
                i++;
            }

            
        }
        System.out.println(avg);
        System.out.println(maxsum);
         
    }
}
