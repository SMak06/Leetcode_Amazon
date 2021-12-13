class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i= 0 ;i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) map.put(s.charAt(i),i);
            else map.put(s.charAt(i),-1);
        }
        int ans = Integer.MAX_VALUE;
        for(char c: map.keySet()) {
            if(map.get(c) < ans && map.get(c) > -1)
                ans = map.get(c);
        }
        return ans == Integer.MAX_VALUE? -1: ans;
    }
}
