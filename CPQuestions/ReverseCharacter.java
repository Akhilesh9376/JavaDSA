package CPQuestions;

public class ReverseCharacter {
    public static void reverseString(char[] s) {
        int start = 0, end = s.length - 1;
        while (start != end && start <= end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }

    }

    public static boolean checkVowels(char c) {
        char ch[] = { 'a', 'e', 'i', 'o', 'u' };
        for (char character : ch) {
            if (character == c) {
                return true;
            }
        }
        return false;
    }

    public static void swap(String str, char first, char last) {
        char temp = first;
        first = last;
        last = temp;
        // str.c
    }

    public static String reverseVowels(String s) {
        // this function is not working properly wright now ;
        int start = 0;
        int end = s.length() - 1;
        while (start != end && start <= end) {
            if (checkVowels(s.charAt(start)) && checkVowels(s.charAt(end))) {
                char temp = s.charAt(start);
                s.replace(s.charAt(start), s.charAt(end));
                s.replace(s.charAt(end), temp);
                start++;
                end--;
            } else if (checkVowels(s.charAt(start)) && checkVowels(s.charAt(end)) == false) {
                end--;
            } else if (checkVowels(s.charAt(start)) == false && checkVowels(s.charAt(end)) == true) {
                start++;
            } else {
                start++;
                end--;
            }

        }
        return s;
    }

    public static String abc (String s ) {
        char ch[]=s.toCharArray();
        StringBuilder sb = new StringBuilder("");
        int start=0 ;
        int end=s.length()-1 ;
        while (start!=end && start<=end) {
            if (checkVowels(s.charAt(start)) && checkVowels(s.charAt(end))) {
                char temp=ch[start] ;
                ch[start]=ch[end] ;
                ch[end]=temp ;
                start++  ;
                end-- ;
            }else if(checkVowels(s.charAt(start)) && checkVowels(s.charAt(end))==false) {
                end -- ;
            }else if (checkVowels(s.charAt(start))==false && checkVowels(s.charAt(end))==true){
                start++ ;
            }else{
                start++ ;
                end-- ;
            }
        }
        for (int i=0;i<ch.length;i++) {
            sb.append(ch[i]) ;
        }
        return sb.toString() ;
            
    }

    public static void main(String args[]) {
        // System.out.println(checkVowels('a'));
        String name = "hello";
        String result = abc(name);
        System.out.println(result);

    }
}
