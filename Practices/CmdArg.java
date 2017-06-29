class Cmd {
    public static void main(String[] args) {
        if(args.length==0) {
            System.out.println("No Cmd Arg");
        } else {
            System.out.println("Hello "+args[0]);
        }
    }
}