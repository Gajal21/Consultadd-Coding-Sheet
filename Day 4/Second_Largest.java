class Solution {
    int print2largest(int arr[], int n) {
        // code here
        
        
        int first=Integer.MIN_VALUE;
        
        int sec=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>first){
                sec=first;
                first=arr[i];
            }
            else if(arr[i]> sec && arr[i]<first){
             sec=arr[i];
            }
            
        }
        if(sec==Integer.MIN_VALUE){
            return -1;
        }
        
        return sec;
        
    }
}

// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(1)
