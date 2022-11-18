//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        HashMap<Integer,Integer> e=new HashMap<>();
        
        for(int i=0;i<size;i++){
            if(e.containsKey(a[i]))
            {
                e.put(a[i],e.get(a[i])+1);
                
            }
            else
            {
                e.put(a[i],1);
            }
        }
        
        for(Map.Entry h:e.entrySet()){
            int val=(int)h.getValue();
            
            if(val>size/2){
                int key=(int)h.getKey();
                return key;
            }
        }
        return -1;
    }
}
