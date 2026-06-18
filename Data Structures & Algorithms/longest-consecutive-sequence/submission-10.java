class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        // Step 1: Add all numbers to a HashSet
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        
        int maxStreak = 0;
        
        // Step 2: Look for sequences
        for (int num : set) {
            // Check if 'num' is the start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;
                
                // Count how long this specific sequence is
                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }
                
                // Update the maximum found so far
                maxStreak = Math.max(maxStreak, currentStreak);
            }
        }
        
        return maxStreak;
    }
}
