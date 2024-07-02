import java.util.Scanner;

public class employee {
    private final Scanner sc = new Scanner(System.in);
    private Integer empno;
    private String ename;
    private float basic,hra,da,netpay;

    public void haveData(){
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
    }
    public void dispdata(){
        haveData();
        System.out.println("Employee Number:" +empno);
        System.out.println("Employee Name:" +ename);
        System.out.println("Employee basic:" +basic);
        System.out.println("Employee hra:" +hra);
        System.out.println("Employee da:" +da);
        calculate(basic,hra,da);
        System.out.println("The Netpay of the Employee is:" +netpay);
    }
    public void calculate(float basic,float hra,float da){
        netpay=basic+hra+da;
    }
    public static void main(String[] args) {
        employee emp = new employee();
        emp.dispdata();
    }
}
