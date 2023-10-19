class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(nums, 0, new ArrayList<Integer>(), result);
        return result;
    }

    private void generateSubsets(int[] nums, int index, List<Integer> currentSubset, List<List<Integer>> result) {
        if (index == nums.length) {
            result.add(new ArrayList<>(currentSubset));
            return;
        }

        currentSubset.add(nums[index]);
        generateSubsets(nums, index + 1, currentSubset, result);

        currentSubset.remove(currentSubset.size() - 1);
        generateSubsets(nums, index + 1, currentSubset, result);
    }
}
