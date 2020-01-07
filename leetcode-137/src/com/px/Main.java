class Solution {
    public int singleNumber(int[] nums) {
        int ones = 0;
        int twos = 0;
        int threes = 0;
        for (int num : nums) {
            twos |= ones & num;
            ones ^= num;
            threes = twos & ones;
            ones &= ~threes;
            twos &= ~threes;
        }
        return ones;
    }
}