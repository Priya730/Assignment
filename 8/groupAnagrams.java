class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character, Integer>, ArrayList<String>> bigMap = new HashMap<>();
        
        for(String str : strs){
            HashMap<Character, Integer> freqMap = new HashMap<>();
            for(int i=0; i<str.length(); i++){
                char ch = str.charAt(i);
                freqMap.put(ch, freqMap.getOrDefault(ch, 0)+1);
            }
            
            if(bigMap.containsKey(freqMap)==false){
                ArrayList<String> list = new ArrayList<>();
                list.add(str);bigMap.put(freqMap, list);
            }
            else{
                List<String> list = bigMap.get(freqMap);
                list.add(str);
            }
        }
        
        return new LinkedList<>(bigMap.values());
    }
}
