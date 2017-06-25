class Q10 {
    public static void main(String [] args) {
       int number = 0;
       int count = 0;
       while(count<20) {
            int t = isArmstrong(number);
            if(t==1) {
                System.out.println( (count+1) + ". " + number );
                count++;
            }
            number++;

       }
    }
    public static int isArmstrong(int n) {
            int sum = 0;
            int r = 0;
            int a = n;
            while(a>0) {
                r = a%10;
                sum = sum + (r*r*r);
                a = a/10;
            }
            if(n==sum) {
                return 1;
            } else {
                return 0;
            }
    }
}