package RecursionBasics;

// import java.security.Key;

public class Recursion {
    // Print the number from N to 1 Using Recursion
    public static void printDecreasing(int n){
        if (n==1) {
            System.out.print(n);
            return ;
        }
        System.out.print(n+" ");
        printDecreasing(n-1);
    }
    // Print Number From 1 To N 
    public static void printIncrease(int n ) {
        if (n==1){
            System.out.print(n+" ");
            return ;
        }
        printIncrease(n-1);
        System.out.print(n+" ");
    }
    // Program for factorial Using Recurssion 
    public static int factorial(int n) {
        if (n==1){
            return 1 ;
        }
        int ans =n*factorial(n-1) ;
        return ans ;
    }
    // finding the sum of the first N Natural Number 
    public static int sum(int N ) {
        if (N==1) {
            return 1 ;
        }
        int ans =N+sum(N-1) ;
        return ans ;
    }
    // Program for Printing the Fibonacci Series 
    public static int ithFibo(int N) {
        if (N==1 || N==0 ) {
            return N ;
        }
        int fibo=ithFibo(N-1)+ithFibo(N-2) ;
        
        return fibo ;
    }
    public static void printFibo(int N ) {
        if (N==0 || N==1 ) {

        }
    }
    // Check if a Given Array is Sorted 
    public static boolean isSorted(int arr[],int i) {
        if (i==arr.length-1) {
            return true ;
        }
        if (arr[i]>arr[i+1]) {
            return false ;
        }
        return isSorted(arr, i+1 ) ;
    }
    // Write a Function to find the first Occurence of an element in an array 
    public static int firstOccurence(int arr[],int key,int i) {
        if (i==arr.length-1 ){
            return -1 ;
        }
        if (arr[i]==key) {
            return i ;
        }
        return firstOccurence(arr, key, i+1) ;
    }
    // WAF to find the last occurence of an element in an Array 
    public static int lastOccur(int arr[],int k,int i ){
        if (i==arr.length-1 ){
            return -1 ;
        }
        int isFound=lastOccur(arr, k, i+1);
        if (isFound== -1 && arr[i]==k) {
            return i ;
        }
        return isFound ;
    }
    public static int power(int x,int n) {
        if(n==0) {
            return 1 ;
        }
        return x*power(x, n-1) ;
    }
    public static int optimizedPower(int a,int n ) {
        if (n==0) {
            return 1 ;
        }
        int halfPowerSq = optimizedPower(a, n/2) * optimizedPower(a, n/2) ;
        if (n%2!=0) {
            halfPowerSq=a*halfPowerSq ;
        }
        return halfPowerSq ;
    }
     /*
    Given a "2*n" board and tiles of size "2*1" count the number pf ways 
    to the tiles the given board using the 2*1 tiles 
    A tiles can either be Placed horizontal Or Vertical  
    */
    public static int tilingProblem(int n) {
        // Base Conditional 
        if (n==1 || n==0 ) {
            return 1 ;
        }
        // vertical choices 
        int verticalChoice=tilingProblem(n-1) ;
        // Horizontal choices 
        int horizontalChoice=tilingProblem(n-2) ;
        return horizontalChoice+verticalChoice ;
    }
    // Program for Removing duplicates 
    public static void removeDuplicate(String str,int index,StringBuilder newStr,boolean[] map) {
        if (index==str.length()) {
            System.out.println(newStr);
            return ;
        }
        char currChar=str.charAt(index) ;
        if(map[currChar-'a']==true){
                removeDuplicate(str, index+1, newStr, map);
        }else{
            map[currChar-'a']=true ;
            removeDuplicate(str, index+1, newStr.append(currChar), map);
        }
    }
    /*Given n friends each one can remains single or can 
    be paired up with some other friend 
    each paired can be paired only once 
    find out the total Number of ways in which friends 
    can remains Single or can be paired up 
*/
    public static int friendsPairing(int n ) {
        // Base Case 
        if (n==1 || n==2 ) {
            return n ;
        }
        // Single Pair 
        int singlePair = friendsPairing(n-1) ;

        // twoPaired 
        
        int totalTwoPaired=(n-1)*friendsPairing(n-2) ;
        int total =singlePair+totalTwoPaired ;
        return total ;
    }
    // Print All Binary Strings of Size N without Consecutives 
    // Ones 
    public static void printBinaryStream(int n,int lastPlace,StringBuilder str ) {
        if (n==0 ) {
            System.out.println(str);
            return ;
        }
        printBinaryStream(n-1, 0, str.append("0"));

        if (lastPlace==1) {
            printBinaryStream(n-1, 1, str.append("1"));
        }

    }

    /*
     * Question1:ForagivenintegerarrayofsizeN.
     * You have to find all the occurrences(indices) of agiven element(Key)
     * and print them
     * .Usearecursivefunctiontosolvethisproblem
     */
    public static void printIndex(int arr[] ,int index,int key ){
            if (index==arr.length) {
                return ;
            }
            if (key==arr[index]) {
                System.out.print(index+" ");
            }
            printIndex(arr, index+1, key); 
    }
    /*
     * You are given a number (eg -  2019), convert it into a String of english 
     * like“two zero one nine”.  Use a recursive function to solve this problem.
     * NOTE-Thedigitsofthenumberwillonlybeintherange0-9andthelastdigitofanumbercan’t be 0
     */
    public static void stringToEnglish(int number ) {
        String arr[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        if (number==0) {
            return ;
        }
        int lastDigit=number%10 ;
        stringToEnglish(number/10);
        System.out.print(arr[lastDigit]+" ");
    }
    //  Write a program to findLength of aStringusing Recursion.
    public static int lengthOfString(String str,int index) {
        if (index==str.length()-1 ) {
            return index;
        }
        return lengthOfString(str, index+1) ;
    }
    /*
     * Question4:WearegivenastringS,weneedtofindthecountofallcontiguoussubstringsstarting 
     * and ending with the same character.Sample Input 1: S = "abcab"Sample Output 1: 7
     * There are 15 substrings of "abcab" : a, ab, abc, abca, abcab, b, bc, bca, bcab, c, ca, cab, a, ab, b
     * Outoftheabovesubstrings,thereare7substrings:a,abca,b,bcab,c,aandb.So,only7contiguous substrings 
     * start and end with the same character.
     * Sample Input 2: S = "aba"Sample Output 2: 4The substrings are a, b, a and aba
     */
    public static void printWords(String str,int index) {
        if (index==str.length()-1) {
            System.out.print(str.charAt(index)+" ");
            return ;
        }
        // A K H I L AK AKH AKHI AKHIL AH AI AL 
        System.out.print(str.charAt(index)+" ");
        printWords(str,index+1) ; 
    }
    // printing the number 
    public static void printNumber() {
        int number=1 ;
        if (number==10) {
            return;
        }
        System.out.print(number+" ");
        number++ ;
        printNumber();

    }
    public static void main (String args[]) {
        // System.out.println(ithFibo(3));
        printWords("abc", 0);
    }
}
