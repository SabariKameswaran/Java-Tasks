import java.util.*;
public class ArrayIntersection {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5,8};
        int[] arr2={2,4,6,7,8,5};
        int n=arr1.length;
        Set<Integer> arr3=new HashSet<>();
        int count = 0;
        int i,j;
        for (i=0; i < n; i++) {
            for (j=1;j < n; j++) {
                if (arr1[i] == arr2[j]) {
                    arr3.add(arr1[j]);
                }
            }
        }
        System.out.print(arr3);
    }
}
