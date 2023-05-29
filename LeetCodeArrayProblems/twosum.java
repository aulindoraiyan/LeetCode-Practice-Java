public class twosum {
    //one solution

    class Solution {
        public int[] twoSum(int[] nums, int target) {
            for (int i = 0; i < nums.length; i++){
                for(int j = i+1; j< nums.length; j++){

                    int difference = target - nums[i];
                    if(difference == nums[j]){
                        return new int[] {i, j};
                    }
                }

            }
            throw new IllegalArgumentException("No Match found");
        }
    }

    //another solution
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map <Integer, Integer> num_map = new HashMap<>();


            for(int i = 0; i < nums.length; i++){
                int complement = target - nums[i];
                if(num_map.containsKey(complement)){
                    return new int[] {num_map.get(complement), i};
                }
                num_map.put(nums[i], i);
            }
            throw new IllegalArgumentException("no match found");
        }
    }




}
