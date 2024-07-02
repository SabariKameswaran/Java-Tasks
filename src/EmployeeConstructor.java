import java.util.Scanner;

public class EmployeeConstructor {
    private final Scanner sc = new Scanner(System.in);
    private Integer empno;
    private String ename;
    private float basic,hra,da,netpay;
    public void EmployeeConstructor(){
        System.out.println("Enter the Employee Number:");
        empno=sc.nextInt();
        System.out.println("Enter the Employee Name:");
        ename=sc.next();
        System.out.println("Enter the Basic Salary:");
        basic=sc.nextFloat();
        System.out.println("Enter the hra:");
        hra=sc.nextFloat();
        System.out.println("Enter the da:");
        da=sc.nextFloat();
        EmployeeConstructor(empno,ename,basic,hra,da,netpay);
    }
    public void EmployeeConstructor(Integer empno,String ename,float basic,float hra,float da,float netpay){
        System.out.println("Employee Number:" +empno);
        System.out.println("Employee Name:" +ename);
        System.out.println("Employee basic:" +basic);
        System.out.println("Employee hra:" +hra);
        System.out.println("Employee da:" +da);
        EmployeeConstructor(basic,hra,da);
        System.out.println("The Netpay of the Employee is:" +netpay);
    }
    public void EmployeeConstructor(float basic,float hra,float da){
        netpay=basic+hra+da;
    }
    public static void main(String[] args) {
        EmployeeConstructor emp = new EmployeeConstructor();
        emp.EmployeeConstructor();
    }
}
