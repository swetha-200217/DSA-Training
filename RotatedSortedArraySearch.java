public class RotatedSortedArraySearch {
    public int search(int[] arr, int n) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == n) {
                return mid;
            }
            if (arr[left] <= arr[mid]) {
                if (arr[left] <= n && n < arr[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            else {
                if (arr[mid] < n && n <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        RotatedSortedArraySearch searcher = new RotatedSortedArraySearch();
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int n = 0;
        int result = searcher.search(arr, n);
        System.out.println("Index of " + n + ": " + result);
    }
}
