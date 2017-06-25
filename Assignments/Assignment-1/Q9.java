class Q9 {
    public static void main(String [] args) {
       int number = 125;
       int r = number;
       int d = 2;
       String str = "";
       System.out.print("Prime Factors of "+number+" :");
       while(r/d >= 1) {
        for(int i=2; i<=number;i++) {
            if(r%i==0) {
                str = str+" "+i;
                r = r/i;
                d=i;
                break;
            }
        }
       } 
       System.out.println(str);  
    }
}