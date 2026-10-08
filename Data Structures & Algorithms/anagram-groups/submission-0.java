class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        int n  = strs.length;
        Map<String,List<String>> map = new HashMap<>();

        for(String s : strs){
            String sorted = s.chars()
                            .sorted()
                            .collect(StringBuilder::new,
                            StringBuilder::appendCodePoint,
                            StringBuilder::append)
                            .toString();
            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(s);              
        }

      return new ArrayList<>(map.values());

        
    }
}
