import java.util.Scanner;
class SimpleCalculator {
    double a,b;
    double add() {
        return (a+b);
    }
    double sub() {
        return (a-b);
    }
    double mul() {
        return (a*b);
    }
    double div() {
        return (a/b);
    }
    double square() {
        
        System.out.println("Enter The Numbers : ");
        Scanner read = new Scanner(System.in);
        a = read.nextDouble();

        return Math.pow(a,2);
    }
    double sqrt() {

        System.out.println("Enter The Numbers : ");
        Scanner read = new Scanner(System.in);
        a = read.nextDouble();

        return Math.sqrt(a);
    }
    
    void input() {
        System.out.println("Enter The Two Numbers : ");
        Scanner read = new Scanner(System.in);
        a = read.nextDouble();
        b = read.nextDouble();
    }
    
    
}

class ScientificCalculator {
    
    double a;

    double sin() {
        a = a * 0.0174533d;
        retrun (Math.sin(a));
    }
    double cos() {
        a = a * 0.0174533d;
        retrun (Math.cose(a));
    }
    double tan() {
        a = a * 0.0174533d;
        retrun (Math.tan(a));
    }
    double asin() {
        // a = a * 0.0174533d;
        retrun (Math.asin(a));
    }
    double acos() {
        // a = a * 0.0174533d;
        retrun (Math.acos(a));
    }
    double atan() {
        // a = a * 0.0174533d;
        retrun (Math.atan(a));
    }

     void input() {
        System.out.println("Enter The Numbers : ");
        Scanner read = new Scanner(System.in);
        a = read.nextDouble();
    }

}

class Q3 {
    public static void main(String[] args) {
        SimpleCalculator s = new SimpleCalculator();
        ScientificCalculator sc = new ScientificCalculator();

        System.out.println("Enter The Numbers : ");
        Scanner read = new Scanner(System.in);
        
        System.out.println("Enter Your Choice : ");
        System.out.println("1. Add");
        System.out.println("2. Sub");
        System.out.println("3. Mul");
        System.out.println("5. Div");
        System.out.println("6. Squre of a Number");
        System.out.println("7. Square Root Of A Number");
        System.out.println("8. Sin of Angle (in Degree)");
        System.out.println("9. Cos of Angle (in Degree)");
        System.out.println("10. Tan of Angle (in Degree)");
        System.out.println("11. Sin-1");
        System.out.println("12. Cos-1");
        System.out.println("13. Tan-1");

        int ch = read.nextInt();

        switch(ch) {
            case 1 : {
                s.input();
                System.out.println("Result Is = " + s.add());
                break;
            }
            case 2 : {
                s.input();                
                System.out.println("Result Is = " + s.sub());
                break;
            }
            case 3 : {
                s.input();                
                System.out.println("Result Is = " + s.mul());
                break;
            }
            case 5 : {
                s.input();                
                System.out.println("Result Is = " + s.div());
                break;
            }
            case 6 : {      
                System.out.println("Result Is = " + s.square());
                break;
            }
            case 7 : {                           
                System.out.println("Result Is = " + s.sqrt());
                break;
            }
            case 8 : {
                sc.input();                
                System.out.println("Result Is = " + sc.sin());
                break;
            }
            case 9 : {
                sc.input();                
                System.out.println("Result Is = " + sc.cos());
                break;
            }
            case 10 : {
                sc.input();                
                System.out.println("Result Is = " + sc.tan());
                break;
            }
            case 11 : {
                sc.input();                
                System.out.println("Result Is = " + sc.asin());
                break;
            }
            case 12 : {
                sc.input();                
                System.out.println("Result Is = " + sc.acos());
                break;
            }
            case 13 : {
                sc.input();                
                System.out.println("Result Is = " + sc.atan());
                break;
            }
            default :
                System.out.println("Wrong Choice");
                break;
        }

    }
}