package CPQuestions;

class VowelsReverse {
    public boolean checkVowels(char c) {
        char ch[] = { 'a', 'e', 'i', 'o', 'u' };
        for (char character : ch) {
            if (character == c) {
                return true;
            }
        }
        return false;
    }
    public static boolean specialCharacter(char ch) {
        String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
        for (int i=0;i<specialCharactersString.length();i++) {
            if(specialCharactersString.contains(Character.toString(ch))) {
                return true ;
            }
        }
        return false ;
    }
    public String reverseVowels(String s) {
        char ch[]=s.toCharArray();
        StringBuilder sb = new StringBuilder("");
        int start=0 ;
        int end=s.length()-1 ;
        if (ch.length==2) {
            if (checkVowels(s.charAt(start)) && checkVowels(s.charAt(end))) {
                char temp=ch[start] ;
                ch[start]=ch[end] ;
                ch[end]=temp ;
            }
            // vIncomplete hai abhi 
            else if (checkVowels(ch[start]) && specialCharacter(ch[end])==false ) {
                char temp=ch[start] ;
                ch[start]=ch[end] ;
                ch[end]=temp ;
            }
            
        }
        while (start!=end && start<end) {
            if (checkVowels(s.charAt(start)) && checkVowels(s.charAt(end))) {
                char temp=ch[start] ;
                ch[start]=ch[end] ;
                ch[end]=temp ;
                start++  ;
                end-- ;
            }else if(checkVowels(s.charAt(start)) && checkVowels(s.charAt(end))==false) {
                // sb.append(s.charAt(end));
                //sb.append(s.charAt(start)) ;
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
    public static String longestCommonPrefix(String[] str) {
        StringBuilder sb = new StringBuilder("") ;
        for(int i=0;i<str.length;i++) {
            int j=0 ;
            while (j<str.length-1) {
                if(str[j].charAt(j)==str[j+1].charAt(j)) {
                    
                    j++ ;
                }
            }
            

           
        }
        if(sb.length()==0) {
            return "" ;
        }
        return sb.toString() ;
    }
    public static void main(String[] args) {
        String[] arr={"flower","flow","flag"};
        System.out.println(longestCommonPrefix(arr));
    }
}