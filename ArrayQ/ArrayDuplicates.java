import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ArrayDuplicates {

    static List<Integer> removeDuplicateBruteForce(int[] arr) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            // Check if the current element is already in the result list
            for (int j = 0; j < result.size(); j++) {
                if (arr[i] == result.get(j)) {
                    isDuplicate = true;
                    break;
                }
            }
            // If not a duplicate, add to the result
            if (!isDuplicate) {
                result.add(arr[i]);
            }
        }
        return result;
    }
    
    static List<Integer> removeDuplicateOptimized(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num); // Automatically handles duplicates
        }
        return new ArrayList<>(set); // Convert to List for easier handling
    }

    public static void main(String[] args) {
        int num[] = { 1, 5, 2, 1, 4, 5, 3, 2 };
        List<Integer> result = removeDuplicateOptimized(num);

        // Print unique elements in [1, 5, 2, 4, 3] format
        System.out.println(result);
    }
}
