package arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate{
    public static void main(String[] args) {

        int[] nums;
        boolean result;
        
        nums = new int[]{1,2,3,4};
        result = hasDuplicateOptimized(nums);
        System.out.println(result);

        nums = new int[]{2,2,3,4};
        result = hasDuplicateOptimized(nums);
        System.out.println(result);

        nums = new int[]{};
        result = hasDuplicateOptimized(nums);
        System.out.println(result);

        nums = new int[]{1};
        result = hasDuplicateOptimized(nums);
        System.out.println(result);
    }

    public static boolean hasDuplicateOptimized(int[] nums){

        Set<Integer> numsSet = new HashSet<>();
        for(int i=0; i< nums.length; i++){

            if(!numsSet.add(nums[i]))
                return true;
        }
        return false;
    }

    public static boolean hasDuplicateBrute(int[] nums) {

        if(nums.length == 0 || nums.length == 1)
        return true;

        for(int i=0; i<nums.length; i++){
            for (int j=i+1; j<nums.length; j++){
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }

        return false;
        
    }
}