public class RightHalfPyramid {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++) {
                System.out.print("*-");
                if(j+1>i){
                    System.out.print("\b");
                }
            }
            System.out.println();

        }
    }
}
