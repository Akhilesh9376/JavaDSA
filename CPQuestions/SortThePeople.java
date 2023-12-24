package CPQuestions;

import java.util.*;

public class SortThePeople {
    /*
     * Input: names = ["Mary","John","Emma"], heights = [180,165,170]
        Output: ["Mary","Emma","John"]
        Explanation: Mary is the tallest, followed by Emma and John.
     */
    public static String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> people=new HashMap<>() ;
        String[] ans=new String[names.length];
        for (int i=0;i<names.length;i++) {
            people.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        int k=0;
        /*        for (int i=heights.length-1;i>=0;i--) {
                  ans[k++]=people.get(heights[i]);

        }
         */

         for (int i=0;i<heights.length;i++) {
            ans[i]=people.get(heights[heights.length-1-i]) ;
         }
        return ans ;
    }
    public static void main (String args[]) {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170} ;
        String ans[]=sortPeople(names, heights) ;
        for (String str:ans) {
            System.out.print(str+" " ) ;
        }
    }
}
