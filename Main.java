import java.util.HashMap;

public class Main {
   
     public  static int firstUniqChar(String s) {

        HashMap<Character,Integer> hm = new HashMap<>() ;
        int answer = -1 ;
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i) ;
            if(hm.containsKey(ch)) {
                hm.put(ch,hm.get(ch)+1) ;
            }else{
                hm.put(ch,1) ;
            }
        }
       // Print keys and values
        for (Character i : hm.keySet()) {
            // System.out.println("key: " + i + " value: " + capitalCities.get(i));
            if(hm.get(i)==1) {
                answer = s.indexOf(i);
            }
        }
        return answer ;
    }
    public static void main(String[] args) {
        // System.out.println("Leetcode");
        double a = 35/0 ;
        System.out.println(a);
    }
} 
