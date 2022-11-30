

class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        char c[]=S.toCharArray();
        String s="";
        String res="";
        for(int i=0; i<c.length; i++){
            
           if(c[i]!='.'){
               s=s+c[i];
           }
           
           else{
                res="."+s+ res;
                s="";
           }
           
        }
       
         res=s+ res;
        return  res;
    }
}
