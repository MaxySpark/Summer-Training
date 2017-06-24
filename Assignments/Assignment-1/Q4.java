class Q4 {
    public static void main(String [] args) {
        int a = 10101;
        int n = a;
        int r;
        int sum =0;
        while(a>0) {
            r = a%10;
            sum = ( sum*10 ) + r;
            a = a/10;
        }
        if(n==sum) {
            System.out.println( sum + " is a Palindrome Number");
        } else {
            System.out.println( sum + " is not a Palindrome Number");
        }
    }
}