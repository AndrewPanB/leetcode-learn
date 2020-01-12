class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums.length < 1 || nums[0] >= target) {
            return 0;
        }
        if (nums[nums.length - 1] == target) {
            return nums.length - 1;
        }
        if (nums[nums.length - 1] < target) {
            return nums.length;
        }
        int first = 0;
        int last = nums.length - 1;
        int mid = (first + last) / 2;
        while (true) {
            if (last == first + 1 && nums[first] < target && nums[last] > target) {
                return last;
            }

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                first = mid;
            } else {
                last = mid;
            }
            mid = (first + last) / 2;
        }
    }
}