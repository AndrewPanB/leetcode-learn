class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0]+nums[1]+nums[2];
        for(int i=0; i< nums.length - 2; i++){
            int first = i+1;
            int last = nums.length-1;
            while(first != last){
                int sum = nums[i] + nums[first] + nums[last];
                result = Math.abs(result-target) < Math.abs(sum - target)?result:sum;
                if(sum > target ){
                    last--;
                }else if(sum < target){
                    first++;
                }else{
                    return sum;
                }
            }
        }
        return result;
    }
}
