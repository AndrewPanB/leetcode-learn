class Solution {
    public boolean canJump(int[] nums) {
        int size = nums.length;
        boolean[] record = new boolean[size];
        record[size-1] =true;
        for(int i = size-1;i>=0;i--){
            if(!record[i]){
                for(int j=0; j<=nums[i] && i+j<size;j++){
                    if(record[i+j]){
                        record[i] =true;
                        continue;
                    }
                }
            }
        }
        return record[0];
    }
}
