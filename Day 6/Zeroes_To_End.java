//User function Template for Java

class Solution {
    void pushZerosToEnd(int[] a, int n) {
        // code here
        
        int j=0;
       for(int i=0;i<n;i++){

         if(a[i] != 0){

            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            j++;
         }

     
}
 
    }
}
