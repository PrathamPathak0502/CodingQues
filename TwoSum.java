import java.util.*;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(); 
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        
    
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        TwoSum solution = new TwoSum();
        int[] result = solution.twoSum(nums, target);
        
        System.out.println("Indices of the two numbers that add up to target:");
        System.out.println("Index 1: " + result[0] + ", Index 2: " + result[1]);
    }
}
}