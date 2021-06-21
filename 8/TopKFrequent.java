class Solution {
    public class node implements Comparable<node>{
        int val, freq;
        node(int val, int freq){
            this.val = val;
            this.freq = freq;
        }
        
        node(){
            
        }
        @Override
        public int compareTo(node o){
            return o.freq-this.freq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<node>pq = new PriorityQueue<node>();
        for(int ele: map.keySet()){
            pq.add(new node(ele, map.get(ele)));
        }
        int ans[] = new int[k];
        int l=0; 
        while(l<k){
            node w=pq.remove();
            ans[l] = w.val;
            l++;
        }
        return ans;
    }
}
