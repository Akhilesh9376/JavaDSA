package Hashing.map.HashSet;

import java.util.HashMap;

public class Anagram {
    public static boolean isAnagram(String s ,String t) {
        HashMap<Character,Integer> hm=new HashMap<>() ;
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i) ;
            hm.put(ch, hm.getOrDefault(ch, 0)+1) ;
        }
        for(int i=0;i<t.length();i++) {
            char ch = t.charAt(i) ;
            if (hm.get(ch)!=null) {
                if (hm.get(ch)==1) {
                    hm.remove(ch) ;
                }else {
                    hm.put(ch, hm.get(ch)-1) ;
                }
            }else{
                return false ;
            }
        }
        return hm.isEmpty() ? true:false ;
    }
    public static int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> hm=new HashMap<>() ;
        for(int i=0;i<stones.length();i++) {
            char ch=stones.charAt(i) ;
            hm.put(ch, hm.getOrDefault(ch, 0)+1) ;
        }
        int ans =0 ;
        for(int i=0;i<jewels.length();i++) {
            char ch=jewels.charAt(i) ;
            ans+=hm.get(ch) ;
        }
        return ans ;
    }
        public static void main(String[] args) {
        // System.out.println(isAnagram("aabc", "abc"));
         int n=numJewelsInStones("z","ZZ");
            System.out.println(n);
    }
}
