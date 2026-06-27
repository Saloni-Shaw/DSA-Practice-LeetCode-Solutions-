class Solution {
    public int maximumLength(int[] nums) {
        // Line 1: Create a sorted map to count frequencies of each number
        TreeMap<Integer, Integer> counts = new TreeMap<>();
        
        // Line 2: Loop through the input array to populate our map
        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        // Line 3: Initialize the final answer variable to 1
        int maxLen = 1;

        // Line 4: Check if the number 1 exists in our array
        if (counts.containsKey(1)) {
            int ones = counts.get(1);
            // Line 5: If count of 1 is even, subtract 1. If odd, keep it.
            maxLen = (ones % 2 == 0) ? ones - 1 : ones;
        }

        // Line 6: Loop through each unique number from smallest to largest
        for (int x : counts.keySet()) {
            // Line 7: Skip 1 because we already handled its unique rule above
            if (x == 1) continue; 

            // Line 8: Track the length of the matching sides for the current chain
            int currentLen = 0;
            // Line 9: Use a long variable to track our current number and prevent overflow
            long currentX = x; 

            // Line 10: Run a loop as long as we have 2 or more copies of currentX
            while (counts.getOrDefault((int) currentX, 0) >= 2) {
                // Line 11: Add 2 to the length (one for left wall, one for right wall)
                currentLen += 2;
                // Line 12: Square the number to advance to the next level of the mountain
                currentX = currentX * currentX; 
                
                // Line 13: Stop early if the number grows larger than the problem's limit
                if (currentX > 1000000000) break;
            }

            // Line 14: Check if the final squared number has at least 1 copy left for the peak
            if (currentX <= 1000000000 && counts.getOrDefault((int) currentX, 0) >= 1) {
                // Line 15: Add 1 to include the peak element in the total count
                currentLen += 1;
            } else {
                // Line 16: If no peak exists at the top, sacrifice a side element to be the peak
                currentLen -= 1;
            }

            // Line 17: Update our maximum answer if this current chain is longer
            maxLen = Math.max(maxLen, currentLen);
        }

        // Line 18: Return the final longest pattern length found
        return maxLen;
    }
}

