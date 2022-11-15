
//User function Template for Java

class Solution {
    int remove_duplicate(int A[],int N){
      
     
      int j = 0;
        
        for(int i = 1; i<N; i++){
            if(A[j] !=A[i]){
                j++;
                A[j] = A[i];
            }
        }
        return i+1;
    }
}


// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(1)
