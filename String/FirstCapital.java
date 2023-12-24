package String;

public class FirstCapital {
    public static String capitalizeTitle(String title) {
        StringBuilder sb=new StringBuilder("");
        String[] str=title.split(" ") ;
        for (int i=0;i<str.length;i++) {
            if (str[i].length()<4) {
                sb.append(str[i]+" ") ;
            }else {
                char ch=Character.toUpperCase(str[i].charAt(0));
                String s=str[i].substring(1).toLowerCase() ;
                sb.append(ch+s+" ");
            }
        }
        return sb.toString();
    }
    public static void main (String[] args ) {
        System.out.println(capitalizeTitle("First leTTeR of EACH Word"));
    }        
}
