class Combinations {
    public static void main(String[] args) {
        int len = args.length;
        if(len==0) {
            System.out.println("No Argument");
        } else {
            int l = 0;
            while(l<len) {
                //for 1
                for(int i=0;i < len; i=i+l) {
                    System.out.println(args[i]);
                }
                l++;
            }
            

            
        }
    }
}