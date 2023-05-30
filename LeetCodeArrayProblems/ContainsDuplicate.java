public class ContainsDuplicate {
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            HashMap<Integer, Integer> numMap = new HashMap<>();
            Boolean value = false;
            for(int i = 0; i < nums.length; i++){
                if(numMap.containsKey(nums[i])){
                    value = true;
                    return value;
                }
                numMap.put(nums[i], i);

            }
            return value;
            // throw new IllegalArgumentException("no nums found");
        }
    }
}
