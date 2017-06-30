import java.util.Scanner;
class Array {
    public static void main(String[] args) {

        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] r = new int[3][3];

        Scanner in = new Scanner(System.in);

        System.out.println("Input For First Array : ");

        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                a[i][j] = in.nextInt();
            }
        }

        System.out.println("Input For Second Array : ");
        
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                b[i][j] = in.nextInt();
            }
        }
//Addition
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                r[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println();
        System.out.println("Matrix A : ");
        
//Show a
         for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Matrix B : ");

        
//Show b
         for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                System.out.print(b[i][j]+"\t");
            }
            System.out.println();
            
        }
        
        System.out.println();
        
        System.out.println("Result Array : ");

         for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                System.out.print(r[i][j]+"\t");
            }
            System.out.println();
            
        }

    }
}