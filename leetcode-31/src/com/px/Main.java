class Solution {
    public void nextPermutation(int[] nums) {
        int first = -1;
        int second = 0;
        for(int i=nums.length -2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                first = i;
                break;
            }
        }
        if(first==-1){
            Arrays.sort(nums);
            return;
        }
        for(int i=nums.length -1 ;i>=0;i--){
            if(nums[i]>nums[first]){
                second = i;
                break;
            }
        }

        int temp = nums[second];
        nums[second] = nums[first];
        nums[first] = temp;
        Arrays.sort(nums,first+1,nums.length);
    }
}
