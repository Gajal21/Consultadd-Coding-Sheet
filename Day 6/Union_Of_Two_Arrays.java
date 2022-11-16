class Solution
{
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
            ArrayList<Integer> list=new ArrayList<Integer>();

        HashMap<Integer,Integer>h=new HashMap<Integer,Integer>();

        for(int i=0;i<n;i++)

        {

            if(!h.containsKey(arr1[i]))

            {

                list.add(arr1[i]);

                h.put(arr1[i],1);

            }

        }
        

         for(int i=0;i<m;i++)

        {

            if(!h.containsKey(arr2[i]))

            {

                list.add(arr2[i]);

               h.put(arr2[i],1);

            }

        }

        Collections.sort(list);

          return list;
          
}

}


