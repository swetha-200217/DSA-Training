public class KthLargestElement {
    public static int kthLargestElement(int arr[],int k){
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
        return arr[arr.length-k];
    }
    public static void main(String[] args) {
        System.out.println(kthLargestElement(new int[]{6,1,2,4,5,3},2));
    }
}
