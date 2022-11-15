
//User function Template for Java

class Solution {
    
    
    static void reverse(int arr[],int start,int end)
    {
    
   while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        } 
        
        
    }
    void leftRotate(int[] arr, int n, int d) {
        // code here
      
        reverse(arr, 0, d-1);
        reverse(arr, d, n-1);
        reverse(arr, 0, n-1);
    }
}


// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(1)
