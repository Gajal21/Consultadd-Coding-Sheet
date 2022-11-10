class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high)
    {
        // code here
        if(arr.length==0 || arr.length==1){
            return ;
        }
        
        //base
    if(low>=high)
    return ;
        
        
        //PARTITION KRO
        
        int p=partition(arr,low,high);
        // THEN LEFT SORT KRO
        quickSort(arr,low,p-1);
        //THEN RIGHT SORT KRO
        quickSort(arr,p+1,high);
    }
    static int partition(int arr[], int s, int e)
    {
        // your code here
        int pivot=arr[s];
        int cnt=0;
        // count elements less or equal to pivot
        for(int i=s+1;i<=e;i++){
            if(arr[i]<=pivot){
                cnt++;
            }
        }
        
        int pivotindex=s+cnt;
        
        int temp=arr[s];
        arr[s]=arr[pivotindex];
        arr[pivotindex]=temp;
        int i=s,j=e;
        
        while(i<pivotindex && j>pivotindex){
            
            
            
            while( arr[i]<=pivot){
                i++;
            }
            
             while( arr[j]>pivot){
                j--;
            }
            if(i<pivotindex && j>pivotindex){
                int temp1=arr[i];
                arr[i]=arr[j];
                arr[j]=temp1;
            }
            
            
            
        }
        return pivotindex;
    } 
}

// Worst Case Time Complexity : O(n2)

// Best Case Time Complexity : O(n*log n)

// Average Time Complexity : O(n*log n)

// Space Complexity: O(n*log n)
