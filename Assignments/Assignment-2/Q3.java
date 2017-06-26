class Test {
    int num;
    Test(int x) {
        num = x;
    }
    public void getReverse() {
        int n = num;
        int r = 0;
        int sum = 0;
        while(n>0) {
            r = n%10;
            sum = ( sum*10 ) + r;
            n = n/10;
        }
        System.out.println("Reverese Of The Number "+num+" is : "+sum);
    }
}
class Q3 {
    public static void main(String[] args) {
        Test t = new Test(123);
        t.getReverse();
    }
}