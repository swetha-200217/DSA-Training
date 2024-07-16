import java.util.*;
public class secondLargest{
    public static int secondLargest(int[] arr){
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return arr[arr.length-2];
    }
    public static void main(String[] args){
        System.out.println(secondLargest(new int[]{3, 2, 1, 5, 6, 4}));
    }
}
