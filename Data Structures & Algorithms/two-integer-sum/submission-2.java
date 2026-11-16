class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int res = target - num;

            if(map.containsKey(res)){
                return new int[] {map.get(res), i};
            }
            map.put(num, i);
        }
        return new int[] {};
    }
}
