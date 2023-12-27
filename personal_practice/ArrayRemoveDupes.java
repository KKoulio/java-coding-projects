package personal_practice;

public class ArrayRemoveDupes {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;

        int current = 0;    // Shows where we are
        int scout = 1;  // Scouts for dupes

        while (scout < nums.length) {
            if (nums[scout] != nums[current]){
                current++;
                nums[current] = nums[scout];
            }

            scout++;
        }

        return current + 1; // Change this from an array pointer to the number asked
    }
}
