public class pattern1 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(i);
//                if(j==n-1)
//                    System.out.print("x");
//                else
//                    System.out.print("x ");
            }
            if(i!=n-1)
                System.out.print("\n");
        }

    }
}
