public class FullPyramidWithStar {
    public static void main(String[] args) {
        int n=5;
        for (int i=n;i>=1;i--) {
            for (int j=1;j<i;j++) {
                System.out.print(" ");
            }
            for (int s=i;s<=n;s++) {
                System.out.print("*-");
                if(s+1>n){
                    System.out.print("\b");
                }
            }
            System.out.println();
        }
    }
}
