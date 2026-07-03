package DSA;

import java.util.HashSet;
import java.util.Set;

public class Day8 {
    
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) set.add(n);

        int longest = 0;
        for (int n : set) {
            if (!set.contains(n - 1)) { // only start counting at sequence start
                int length = 1;
                while (set.contains(n + length)) length++;
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }


}
