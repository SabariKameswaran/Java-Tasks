import java.sql.SQLOutput;

public class pattern {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i < n; i++) {
//            String m = (i % 2 != 0) ? "x" : " ";
//            System.out.print(m);
              System.out.print((i==(n-1))?("x"):("x "));
        }
    }
}