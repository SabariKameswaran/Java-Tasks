import java.util.*;
public class ArrayUnion {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,8};
        int[] arr2={2,4,6,7,8,5};
        Set<Integer> arr1=new HashSet<>();
        for(int num : arr){
            arr1.add(num);
        }
        for (int num1 : arr2){
            arr1.add(num1);
        }
        System.out.print(arr1);
    }
}
