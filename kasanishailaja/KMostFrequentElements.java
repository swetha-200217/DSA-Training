import java.util.*;
public class TopKFrequentElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.println("Enter the value of k:");
        int k = scanner.nextInt();
        List<Integer> result = topKFrequent(nums, k);
        System.out.println("The " + k + " most frequent elements are:");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    public static List<Integer> topKFrequent(int[] nums, int k) {
        int maxElement = Arrays.stream(nums).max().orElse(Integer.MIN_VALUE);
        int minElement = Arrays.stream(nums).min().orElse(Integer.MAX_VALUE);
        int range = maxElement - minElement + 1;
        int[] frequency = new int[range];
        for (int num : nums) {
            frequency[num - minElement]++;
        }
        List<Integer> uniqueElements = new ArrayList<>();
        for (int i = 0; i < range; i++) {
            if (frequency[i] > 0) {
                uniqueElements.add(i + minElement);
            }
        }
        Collections.sort(uniqueElements, (a, b) -> frequency[b - minElement] - frequency[a - minElement]);
        return uniqueElements.subList(0,k);
    }
}
