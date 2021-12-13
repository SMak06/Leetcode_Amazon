class Solution {
    public int singleNumber(int[] nums) {
        // Map<Integer, Integer> map = new HashMap<>();
        // for(int i: nums) {
        //     map.put(i, map.getOrDefault(i,0)+1);
        // }
        // for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
        //     if(entry.getValue() == 1)
        //         return entry.getKey();
        // }
        // return -1;
        int one = 0, two =0;
        for(int i = 0;i < nums.length;i++){
            one = one ^ nums[i] & ~two;
            two = two ^ nums[i] & ~one;
        }
        return one;
    }
}
