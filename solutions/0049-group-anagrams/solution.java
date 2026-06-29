class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>>map=new HashMap<>();
        for(String s:strs){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);

            String sortedKey=String.valueOf(ch);
            
            if(!map.containsKey(sortedKey)){
                map.put(sortedKey,new ArrayList<>());
            }
            map.get(sortedKey).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
