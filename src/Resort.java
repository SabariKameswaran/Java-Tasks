import java.util.Scanner;

public class Resort {
    private Scanner sc = new Scanner(System.in);
    private Integer Rno;
    private String Name;
    private double Charges;
    private Integer Days;

    public void getInfo() {
        System.out.print("Enter Room No: ");
        Rno = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Customer Name: ");
        Name = sc.nextLine();
        System.out.print("Enter Charges per Day: ");
        Charges = sc.nextDouble();
        System.out.print("Enter Number of Days: ");
        Days = sc.nextInt();
    }

    public void display() {
        getInfo();
        System.out.println("Room No: " + Rno);
        System.out.println("Customer Name: " + Name);
        System.out.println("Charges per Day: " + Charges);
        System.out.println("No of Days: " + Days);
        compute(Charges, Days);
    }

    public void compute(double Charges, int Days) {
        double totalCharges = Charges * Days;
        if (totalCharges > 11000) {
            totalCharges += (1.02 / 100) * totalCharges;
        }
        System.out.println("Total Charges to be Paid: " + totalCharges);
    }

    public static void main(String[] args) {
        Resort res = new Resort();
        res.display();
    }
}
