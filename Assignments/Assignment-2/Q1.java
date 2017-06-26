class Employee {

    private int EmpId;
    private String EmpName;
    private int DeptID;
    private String Bloodgroup;    
    private int Salary;

    public void setData(int e_id,String e_name, int dep_id, String b_grp, int salary) {
        EmpId = e_id;
        EmpName = e_name;
        DeptID = dep_id;
        Bloodgroup = b_grp;
        Salary = salary;
    }

    public void showData() {
        System.out.println("Employee Id : "+ EmpId);
        System.out.println("Employee Name : "+ EmpName);
        System.out.println("Employee Depertment ID : "+ DeptID);
        System.out.println("Employee Blood Group : "+ Bloodgroup);
        System.out.println("Employee Salary : "+ Salary);
    }
    
}

class Q1 {
    public static void main(String [] args) {
        Employee emp = new Employee();
        emp.setData(13, "John Wick" , 7 , "O+ve" , 99999 );
        emp.showData();
    }
}