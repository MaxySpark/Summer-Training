class Q7d {
    public static void main(String [] args) {
        String str = "ABCDEFGHIJKLMNO";
        int count = 0;
        for(int i=0;i<5;i++) {
            for(int z=3-i;z>=0;z--) {
               System.out.print(" ");
            }
            for(int j=count;j<=count+i;j++) {
                System.out.print(str.charAt(j)+" ");
            }
            System.out.print("\n");
            count = count+i+1;
        }
        count -= 6;
        for(int i=3;i>=0;i--) {
            for(int z=3-i;z>=0;z--) {
               System.out.print(" ");
            }
            for(int j=count;j>=count-i;j--) {
                System.out.print(str.charAt(j)+" ");
            }
            System.out.print("\n");
            count = count-i-1;
        }
    }
}