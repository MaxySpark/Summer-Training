class Q7b {
    public static void main(String [] args) {
       for(int i = 1; i<=5;i++) {
           for(int z=5-i;z>=0;z--) {
               System.out.print(" ");
           }
           for(int j=1;j<=i;j++) {
                System.out.print("*");
           }
           System.out.print("\n");
       }
    }
}