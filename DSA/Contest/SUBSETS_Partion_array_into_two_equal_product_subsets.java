package Contest;

import java.util.*;

public class SUBSETS_Partion_array_into_two_equal_product_subsets {

    static List<Set<Integer>> validSubsets = new ArrayList<>();

    static boolean canPartition(int[] nums, int target) {
        generateSubsets(new ArrayList<>(), 0, nums, target);

        // Check if two disjoint subsets with product = target exist
        for (int i = 0; i < validSubsets.size(); i++) {
            for (int j = i + 1; j < validSubsets.size(); j++) {
                Set<Integer> set1 = validSubsets.get(i);
                Set<Integer> set2 = validSubsets.get(j);
                if (Collections.disjoint(set1, set2)) {
                    return true;
                }
            }
        }

        return false;
    }

    // Recursive processed–unprocessed method
    static void generateSubsets(List<Integer> processed, int index, int[] nums, int target) {
        if (index == nums.length) {
            if (!processed.isEmpty()) {
                int product = 1;
                for (int num : processed) product *= num;
                if (product == target) {
                    validSubsets.add(new HashSet<>(processed));
                }
            }
            return;
        }

        // Include current number
        processed.add(nums[index]);
        generateSubsets(processed, index + 1, nums, target);
        processed.remove(processed.size() - 1); // backtrack

        // Exclude current number
        generateSubsets(processed, index + 1, nums, target);
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 1, 6, 8, 4};
        int target1 = 24;
        System.out.println(canPartition(nums1, target1));  // Output: true

        int[] nums2 = {2, 5, 3, 7};
        int target2 = 15;
        System.out.println(canPartition(nums2, target2));  // Output: false
    }
}

