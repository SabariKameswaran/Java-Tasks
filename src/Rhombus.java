public class Rhombus {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++){
                System.out.print("*-");
                if(k==n)
                    System.out.print("\b");
            }
            System.out.println();
        }
    }
}
