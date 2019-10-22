class Solution {
    public boolean canJump(int[] nums) {
        int location = nums.length-1;
        for(int i = location; i>=0;i--){
            if(i+nums[i] >= location){
                location =i;
            }
        }
        return location == 0;
    }
}
