class Solution
{
  
    void mergeSort(int a[], int s, int e)
    {
        //code here
        
        if(s>=e){
        return ;
            
        }
        int m=s+(e-s)/2;
        
        mergeSort(a,s,m); //to sort left part
        mergeSort(a,m+1,e); // to sort right part
        
        merge(a,s,m,e);
    }
    
    void merge(int a[], int s, int m, int e)
    {
         // Your code here
         
         int len1=m-s+1;
         int len2=e-m;
         int arr1[]=new int[len1];
         int arr2[]=new int[len2];
         
         int maini=s;
         for(int i=0;i<len1;i++){
             arr1[i]=a[maini++];
         }
         maini=m+1;
         for(int i=0;i<len2;i++){
             arr2[i]=a[maini++];
         }
         int idx1=0,idx2=0;
         maini=s;
         
         while(idx1<len1 && idx2<len2){
             
             if(arr1[idx1]<arr2[idx2]){
                 a[maini++]=arr1[idx1++];
             }
             else
             {
                 a[maini++]=arr2[idx2++];
             }
         }
         while(idx1<len1){
             
               a[maini++]=arr1[idx1++];
             
         }
         while(idx2<len2){
              a[maini++]=arr2[idx2++];
             }
             
             
         }
}

// Worst Case Time Complexity : O(n*log n)

// Best Case Time Complexity : O(n*log n)

// Average Time Complexity : O(n*log n)

// Space Complexity: O(n)
