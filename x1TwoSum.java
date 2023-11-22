import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class x1TwoSum {
    public int[] twoSum(int[] nums, int target){
        // Create a map to store elements from the array as keys and their indices as values
        Map<Integer, Integer> indexMap = new HashMap<>();

        // Iterate through the elements in the 'nums' array 
        for(int i = 0; i < nums.length; i++){
            // Calculate the value that needs to be found to reach the target 
            int remaining = target - nums[i];

            // Check if the 'remaining' value exits as a key in the 'indexMap'
            if(indexMap.containsKey(remaining)){
                // If found, return an array with indices of the two elements
                // The first index is the value associated with 'remaining' in the map
                // The second index is the current index 'i'
                return new int[]{indexMap.get(remaining), i};
            }
            
            // If 'remaining' is not found, add the current element to the 'indexMap'
            // This allows us to prepare the map for future lokups
            indexMap.put(nums[i], i);
        }

        // If no pair is found, return an empty array
        return new int[0];
    }

    public static void main(String[] args) {
        // Example usage of the twoSum function
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Create an instance of the Solution class 
        x1TwoSum twoSumInstance = new x1TwoSum();

        // Call the twoSum function and store the result in the 'result' array
        int[] result = twoSumInstance.twoSum(nums, target);

        // Print the result
        System.out.println("Indices of the two numbers: " + Arrays.toString(result));
    
    }

}
