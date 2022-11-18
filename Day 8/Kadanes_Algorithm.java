

class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        
      long best_sum= Integer.MIN_VALUE, sum =0;
        for( int i =0; i< n; i++)
      {
          sum+=arr[i];
          best_sum = Math.max( best_sum, sum);
          if( sum<0) sum = 0;
          
          
      }  
      return best_sum;
        
    }
    
}

// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(1)

