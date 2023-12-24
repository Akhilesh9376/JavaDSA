package CPQuestions;
import java.util.*;

public class SuffleString {
    public static String restoreString(String s, int[] indices) {
        Map<Integer,String> map=new HashMap<>();
        for (int i=0;i<indices.length;i++) {
            map.put(indices[i], String.valueOf(s.charAt(i)));
        }
        Arrays.sort(indices);
        String str="" ;
        for (int i=0;i<indices.length;i++){
            str+=map.get(i);
        }

        return str ;
    }
    public static void main (String[] args ) {
        String str="codeleet" ;
        int[] indices = {4,5,6,7,0,2,1,3} ;
       System.out.println(restoreString(str, indices));
    }
}
