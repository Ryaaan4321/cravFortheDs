class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        int maxstreak = 0;
        for (int num : nums) {
            map.add(num);
        }
        
        for (int num : nums) {
            if (!map.contains(num - 1)) {
                int currNum = num;
                int currst = 1;
                
                while (map.contains(currNum + 1)) {
                    currst++;
                    currNum++;
                }
                
                maxstreak = Math.max(maxstreak, currst);
            }
        }
        
        return maxstreak;
    }
}
