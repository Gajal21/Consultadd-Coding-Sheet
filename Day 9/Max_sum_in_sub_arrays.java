class Solution {
    
    public static long pairWithMaxSum(long arr[], long N)
    {
        // Your code goes here
        if(N==1||N==0)
        {
            return 0;
        }

        long sum=0;
        long max_sum=0;

        for(int i=0;i<N-1;i++)

        {

            sum=arr[i]+arr[i+1];

            if(sum>max_sum)
              
                max_sum=sum;

        }

        return max_sum;
    }
}
