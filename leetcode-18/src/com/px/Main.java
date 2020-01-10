class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                int k = j + 1;
                int l = nums.length - 1;
                while (k != l) {
                    int sum = nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum == target) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);
                        if (result.isEmpty() || !isContains(result, temp)) {
                            result.add(temp);
                        }
                        k++;
                    } else if (sum > target) {
                        l--;
                    } else {
                        k++;
                    }
                }
            }
        }

        return result;
    }

    private boolean isContains(List<List<Integer>> result, List<Integer> temp) {
        boolean flag = false;
        for (int i = 0; i < result.size(); i++) {
            List<Integer> t = result.get(i);
            if (t.get(0).equals(temp.get(0)) && t.get(1).equals(temp.get(1)) && t.get(2).equals(temp.get(2)) && t.get(3).equals(temp.get(3))) {
                flag = true;
                break;
            }
        }
        return flag;
    }

}