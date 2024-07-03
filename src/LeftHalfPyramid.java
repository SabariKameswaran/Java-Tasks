public class LeftHalfPyramid {
    public static void main(String[] args) {
        int n = 5;
        int s=1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for(int h=1;h<=s;h++){
                System.out.print("*");
            }
            System.out.println();
            s++;
        }
    }
}
