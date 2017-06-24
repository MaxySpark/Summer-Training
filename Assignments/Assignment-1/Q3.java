class Q3 {
    public static void main(String [] args) {
        int a = 66;
        int b = 69;
        int x;
        if(a<b) {
            x = a;
        } else {
            x = b;
        }
        int gcd = 1;
        for(int i = 1;i<x;i++) {
            if(a%i==0 && b%i==0) {
                gcd = i;
            }
        }
        System.out.println("GCD of " +a+" and "+b+" is "+gcd);
    }
}