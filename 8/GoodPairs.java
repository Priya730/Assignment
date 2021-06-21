class Solution {
    public int numIdenticalPairs(int[] nums) {
        int cnt = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
             map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int val : map.values()){
            cnt += val*(val-1) / 2;
        }
        return cnt;
    }
}
