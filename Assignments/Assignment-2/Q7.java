class Q7 {
    public static void main(String[] args) {
        String str = "ABCDE";
        int count = 0;
        while(count < 5) {
            int l = 0;
            int s = 5-count;
            while(s>0) {
                System.out.print(" ");
                s--;
            }
            while(l<=count){
                System.out.print(str.charAt(l));
                l++;
            }

            int r = count;
            while(r>0) {
                System.out.print(str.charAt(r-1));
                r--;
            }
            System.out.print("\n");
            count++;
        }
    }
}