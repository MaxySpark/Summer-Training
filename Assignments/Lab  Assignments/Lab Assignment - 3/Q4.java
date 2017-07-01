import java.util.Scanner;

class Employee {
    String emp_code;
    String emp_name;
    String emp_ssn;
    String emp_dep;
    Employee() {
        emp_code = "0000";
        emp_name = "NA";
        emp_ssn = "10XX";
        emp_dep = "Not Known";
    }
    void getData() {
        Scanner read = new Scanner(System.in);
        String temp;
        System.out.println("Enter Emp Code : ");
        temp = read.nextLine();
        if(!temp.trim().equals("")){
            emp_code = temp;
        }
        System.out.println("Enter Emp Name : ");
        temp = read.nextLine();
        if(!temp.trim().equals("")){
            emp_name = temp;
        }
        System.out.println("Enter Emp Ssn : ");
        temp = read.nextLine();
        if(!temp.trim().equals("")){
            emp_ssn = temp;
        }
        System.out.println("Enter Emp Dep : ");
        temp = read.nextLine();
        if(!temp.trim().equals("")){
            emp_dep = temp;
        }
    }
    void dispData() {
        System.out.println("Emp Code Is : " + emp_code);
        System.out.println("Emp Name Is : " + emp_name);
        System.out.println("Emp Ssn Is : " + emp_ssn);
        System.out.println("Emp Dep Is : " + emp_dep);
        System.out.println();
    }
}

class Q4 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();
        emp1.getData();
        emp2.getData();
        emp3.getData();

        System.out.println("Employee Details : \n");
        emp1.dispData();
        emp2.dispData();
        emp3.dispData();
    }
}