import java.util.*;

public class Main {
    static int isprime(int num) {
        if (num < 2)
            return 0;
        for (int i = 2; (i < (num / 2) + 1); i++) {
            if (num % i == 0)
                return 0;
        }
        return 1;
    }
        static void twinPrime(int num){
            for(int i=2;i<=num+2;i++)
                if(isprime(i)==1 && isprime(i+2)==1)
                    System.out.println(i +","+ (i+2));
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        twinPrime(num);
    }
}