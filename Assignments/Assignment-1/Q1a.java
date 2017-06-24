class Q1a {
    public static void main(String [] args) {
        int a = 1;
        int b = 2;
        int temp;
        System.out.println("Before Swapping a = " + a + " and b = " + b);
        temp = b;
        b = a;
        a = temp;
        System.out.println("After Swapping a = " + a + " and b = " + b);
    }
}