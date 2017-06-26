class Q5 {
    public static void main(String [] args) {
        long[] fibo = new long[100];
       for(int i = 0; i<50;i++) {
           if(i==0) {
               fibo[i] = 0;
           } else if(i==1) {
               fibo[i] = 1;
           } else {
               fibo[i] = fibo[i-1]+fibo[i-2];
           }
           System.out.println(i+1 +". "+ fibo[i]);
       }
    }
}

//memorising