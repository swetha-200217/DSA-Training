import java.util.Arrays;
public class MoveZeroesToEnd {
    public static void moveZeroesToEnd(int[] arr) {
        int nonZeroIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex++] = arr[i];
            }
        }
        for (int i = nonZeroIndex; i < arr.length; i++) {
            arr[i] = 0;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 0, 3, 12};
        moveZeroesToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}
