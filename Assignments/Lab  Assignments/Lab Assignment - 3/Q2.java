class Addition {
    int add(int a,int b) {
        return (a + b);
    }
    int add(int a,int b,int c) {
        return (a+b+c);
    }
    int add(int a,int b,int c,int d) {
        return (a+b+c+d);
    }
}

class Q2 {
    public static void main(String[] args) {
        Addition a = new Addition();
        System.out.println("Adddition of 2 and 3 = " + a.add(2,3));
        System.out.println("Adddition of 1 , 2 and 3 = " + a.add(1,2,3));
        System.out.println("Adddition of 1 , 2 , 3 and 4 = " + a.add(1,2,3,4));
    }
}