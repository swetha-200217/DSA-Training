import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KMostFrequentElements {

    static class ElementFrequency {
        int element;
        int frequency;
        
        ElementFrequency(int element, int frequency) {
            this.element = element;
            this.frequency = frequency;
        }
    }
    
    public static List<Integer> topKFrequent(int[] nums, int k) {
        // Step 1: Find the maximum element to determine the size of the frequency array
        int max = Arrays.stream(nums).max().getAsInt();
        int min = Arrays.stream(nums).min().getAsInt();
        int range = max - min + 1;

        // Step 2: Create a frequency array
        int[] freq = new int[range];
        for (int num : nums) {
            freq[num - min]++;
        }

        // Step 3: Create a list of ElementFrequency objects
        List<ElementFrequency> freqList = new ArrayList<>();
        for (int i = 0; i < range; i++) {
            if (freq[i] > 0) {
                freqList.add(new ElementFrequency(i + min, freq[i]));
            }
        }

        // Step 4: Sort the list based on frequency in descending order
        freqList.sort((a, b) -> b.frequency - a.frequency);

        // Step 5: Extract the top k elements
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            result.add(freqList.get(i).element);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        List<Integer> result = topKFrequent(nums, k);
        System.out.println(result); 
        }
}
