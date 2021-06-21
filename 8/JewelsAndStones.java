class Solution {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> jewels = new HashSet<>();
        for(int i=0; i<J.length();i++){
            char jewel = J.charAt(i);
            jewels.add(jewel);
        }
        int cnt = 0;
        
        for(int i=0; i<S.length(); i++){
            char stone = S.charAt(i);
            if(jewels.contains(stone)) cnt++;
        }
        
        return cnt;
    }
}
