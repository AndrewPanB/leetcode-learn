class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        if (nums.length < 1) {
            return result;
        }
        int first = 0;
        int last = nums.length - 1;
        int mid = (first + last) / 2;
        while (true) {
            if (nums[first] > target || nums[last] < target) {
                break;
            }
            if (first == mid && nums[first] != target && nums[last] != target) {
                break;
            }
            if (nums[mid] > target) {
                last = mid - 1;
            } else if (nums[mid] < target) {
                first = mid + 1;
            } else {
                first = mid;
                last = mid;
                while (first >= 0 && nums[first] == target) {
                    first--;
                }
                while (last < nums.length && nums[last] == target) {
                    last++;
                }
                result[0] = first + 1;
                result[1] = last - 1;
                break;
            }
            mid = (first + last) / 2;
        }
        return result;
    }
}