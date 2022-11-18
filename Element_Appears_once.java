
//User function Template for Java

class Sol
{
    public static int search(int A[], int N)
    {
        // your code here
        HashMap<Integer,Integer> h=new HashMap<>();
        
        for(int i=0;i<N;i++)
        {
            if(h.containsKey(A[i])){
                
                h.put(A[i],h.get(A[i])+1);
            }
            else{
             h.put(A[i],1);   
            }
            
            
        }
        for(Map.Entry e:h.entrySet()){
            int val=(int)e.getValue();
            int key=(int)e.getKey();
            if(val==1){
                return key;
            }
        }
        return -1;
        
    }
    
}




// Expected Time Complexity: O(Log(N)).
// Expected Auxiliary Space: O(1).
