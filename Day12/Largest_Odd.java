
class Solution {

    String maxOdd(String S) {
        // code here
    String ans = "", res = "";
        int n = 0;
        char s[]=S.toCharArray();
        
        for(int i=0; i<s.length; i++){
            ans += s[i];
            n = s[i] - '0';
            
            if(n % 2 !=0)
                res = ans;
        }
        return res;
      
    }
}
