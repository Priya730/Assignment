class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int res[] = new int[nums1.length];
        Stack<Integer> s = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums2){
            while(!s.empty() && num>s.peek()){
                map.put(s.pop(), num);
            }
            
            s.push(num);
        }
        
        int i=0;
        for(int num: nums1){
            res[i++] = map.getOrDefault(num, -1);
        }
        return res;
    }
}
