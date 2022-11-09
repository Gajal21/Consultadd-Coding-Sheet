
class Solution
{

	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i=0;i<n;i++){
	        int min=i;
	      for(int j=i+1;j<n;j++)
	      {
	          if(arr[j]<arr[min])
	          {
	              min=j;
	          }
	      }
	      int temp=arr[min];
	      arr[min]=arr[i];
	      arr[i]=temp;
	        
	    }
	}
}
/*  Time Complexities:
Best Case: O(N^2)
Average Case: O(N^2)
Worst Case: O(N^2)
/*
// Space Complexity: O(1)
