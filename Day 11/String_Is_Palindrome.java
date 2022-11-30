class Solution {
    int isPalindrome(String S) {
        // code here
    char c[]=S.toCharArray();
    
    if(c.length==1)
    return 1;
    
    int i=0,j=c.length-1;
    while(i<j){
        if(c[i]==c[j]){
            i++;
            j--;
        }
      else if(c[i]!=c[j]){
          return 0;
      }  
    }
    return 1;
    }
};
