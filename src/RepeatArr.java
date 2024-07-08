import java.util.*;
public class RepeatArr {
    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 1, 2, 1, 3, 7, 8, 7, 7, 8};
        int n=arr.length;
        Set<Integer> arr1=new HashSet<>();
        int count = 0;
        int i,j;
        for (i=0; i < n; i++) {
            for (j=i+1;j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr1.add(arr[j]);
                }
            }
        }
        System.out.print(arr1);
    }
    }