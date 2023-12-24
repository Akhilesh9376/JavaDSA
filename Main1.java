public class Main1 {
    public static void main(String[] args) {
        A a=new A() ;
        int ans = a.add(12,13) ;
        System.out.println("The Sum is "+ans );
    }
    static class A {
        public int add(int a ,int b ) {
            return a+b ;
        }
    }
}
