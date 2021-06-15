class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        Stack<Integer> st = new Stack<Integer>();
        
        for(int i=0; i<nums.length; i++){
            while(!st.isEmpty() && nums[i]<nums[st.peek()]&&st.size()+nums.length-i>k){
                st.pop();
                
            }
            
            if(st.size()<k){
                st.push(i);
            }
        
        }
        int i = k;
        int [] res = new int[k];
        
        while(!st.isEmpty()){
            res[--i]=nums[st.pop()];
        }
        
        return res;
        
    } 
}
