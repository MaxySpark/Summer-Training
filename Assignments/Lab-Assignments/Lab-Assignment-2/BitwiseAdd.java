import java.util.Scanner;
class BitwiseAdd {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter The First Number : ");
        int x = read.nextInt();
        System.out.println("Enter The Second Number : ");        
        int y = read.nextInt();
        while(y!=0) {
            int c = x & y;
            x = x ^ y;
            y = c << 1;
        }
        System.out.println("Addition : "+x);        
    }
}