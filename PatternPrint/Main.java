package PatternPrint;

public class Main {
    // creating the hollow rectangle 
    public static void hollow_Rectangle(int totRows,int totCols) {
        // outer loop 
        for (int i=1;i<=totRows;i++){
            // inner loops 
            for (int j=1;j<=totCols;j++){
                if (i==1 || i==totRows || j==1 || j==totCols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    // pattern for reverese traingle 
    public static void revTriangle(int rows ) {
            for (int i=1;i<=rows;i++) {
                // spaces 
                for (int j=1;j<=rows-i;j++) {
                    System.out.print(" ");
                }

                // for stars ;
                for (int j=1;j<=i;j++) {
                    System.out.print("*");
                }

               System.out.println();
            }
    }
    // inverted half pyramid with number 
    public static void half_pyramid_with_number(int n){
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=n+1-i;j++) {
                    System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    // printing the floyd's triangle 
    public static void floydTriangle(int n) {
        int num=1 ;
        for (int i=1;i<=n ;i++) {
            for (int j=1;j<=i;j++) {
                System.out.print(num+" ");
                num++ ;
            }
            System.out.println();
        }
    }

    public static void zeroOneTriangle(int n ) {
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=i;j++) {
                if ((i+j)%2==0){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
    // printing the butterfly pattern 
    public static void butterfly(int n){
        for (int i=1;i<=n;i++) {
            // printing the star 
            for (int j=1;j<=i;j++) {
                System.out.print("*");
            }
            // printing the space ;
            for (int j=1;j<=2*n-2*i;j++) {
                System.out.print(" ") ;
            }

            for (int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // for the second half 
        for (int i=n;i>=1;i--) {
            for (int j=1;j<=i;j++) {
                System.out.print("*");
            }

            for (int j=1;j<=2*(n-i);j++) {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void solid_Rhombus(int n) {
        for (int i=1;i<=5;i++) {
            // printing the space of
            for (int j=1;j<=(n-i);j++) {
                System.out.print(" ");
            }

            // print star 
            for (int j=1;j<=n;j++) {
                System.out.print("* ");
            }

           

            System.out.println();
        }
    }
    // program for hollow rhombus 
    public static void hollow_rhombus(int n) {
      for (int i=1;i<=n;i++) {
        // printing the spache first
        for (int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        // pring the boundary line 
        for (int j=1;j<=n;j++) {
            if (i==1 || i==n || j==1 || j==n) {
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
      }
    }
    public static void demo(int n) {
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=(n-i+1);j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void main (String[] args) {
        demo(5);
    }
}
