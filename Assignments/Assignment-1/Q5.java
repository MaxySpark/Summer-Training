class Q5 {
    public static void main(String [] args) {
       for(long i = 0; i<50;i++) {
           System.out.println(i+1 +". "+ fibo(i));
       }
    }
    public static long fibo(long n) {
        if(n==0) {
            return 0;
        } else if(n==1) {
            return 1;
        } else {
            return fibo(n-1)+fibo(n-2);
        }
    }
}