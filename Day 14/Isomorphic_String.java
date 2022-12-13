class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
        // Your code here
              if(str1.length()!=str2.length()) return false;

      return fun(str1,str2) && fun(str2,str1);

    }

    static boolean fun(String str1,String str2){

          HashMap<Character,Character> map = new HashMap<>();

      for(int i=0;i<str1.length();i++){

          if(map.containsKey(str1.charAt(i)) && str2.charAt(i)!=map.get(str1.charAt(i))){

              return false;

          }

          if(!map.containsKey(str1.charAt(i))){

              map.put(str1.charAt(i),str2.charAt(i));

          }

          

      }

        return true;
    }
}
