

class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        char c[]=S.toCharArray();
        String ans="";
        String str="";
        for(int i=0; i<c.length; i++){
            
           if(c[i]!='.'){
               str=str+c[i];
           }
           
           else{
                ans="."+str+ans;
                str="";
           }
           
        }
       
        ans=str+ans;
        return ans;
    }
}
