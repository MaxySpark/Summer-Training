class Q2 {
    public static void main(String [] args) {
        int a = 101;
        int flag = 0;
        for(int i=2;i<a;i++){
            if(a%i==0) {
                flag = 1;
                break;
            } 
        }
        if(flag==1) {
            System.out.println(a + " is not a Prime Number");
        } else {
            System.out.println(a + " is a Prime Number");
        }
    }
}