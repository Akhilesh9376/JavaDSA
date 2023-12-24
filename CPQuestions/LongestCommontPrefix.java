package CPQuestions;

public class LongestCommontPrefix {
    public static String lonest(String[] strs) {
        StringBuilder sb=new StringBuilder("") ;
        for (int i=0;i<strs.length;i++) {
            for (int j=i+1;j<strs.length;j++) {
                if (strs[i].charAt(i)==strs[j].charAt(i)) {
                    sb.append(strs[i]) ;
                }
            }
        }
        if (sb.length()==0) {
            return "" ;
        }

        return sb.toString();

    }
    public static void main(String[] args) {
        String[] strs={"dog","racecar","car"} ;
        System.out.println(lonest(strs));
    }
}
