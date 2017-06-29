import java.util.Scanner;
class SimpleCalculator {
    double add(double a,double b) {
        return (a+b);
    }
    double sub(double a, double b) {
        return (a-b);
    }
    double mul(double a, double b) {
        return (a*b);
    }
    double div(double a, double b) {
        return (a/b);
    }
    
}

class ScientificCalculator {
    
}

class Q3 {
    public static void main(String[] args) {
        SimpleCalculator s = new SimpleCalculator();

        System.out.println("Enter The Two Numbers : ");
        Scanner read = new Scanner(System.in);
        double a = read.nextDouble();
        double b = read.nextDouble();

        System.out.println("Enter Your Choice : ");
        System.out.println("1. Add");
        System.out.println("2. Sub");
        System.out.println("3. Mul");
        System.out.println("4. Div");

        int ch = read.nextInt();

        switch(ch) {
            case 1 : {
                System.out.println("Addition Is = " + s.add(a,b));
                break;
            }
            case 2 : {
                System.out.println("Addition Is = " + s.sub(a,b));
                break;
            }
            case 3 : {
                System.out.println("Addition Is = " + s.mul(a,b));
                break;
            }
            case 4 : {
                System.out.println("Addition Is = " + s.div(a,b));
                break;
            }
            default :
                System.out.println("Wrong Choice");
        }

    }
}