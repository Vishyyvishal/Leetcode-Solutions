class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        
        for(String st : strs) {
            // sort the string
            char[] charArr = st.toCharArray();
            Arrays.sort(charArr);
            String sortedString = new String(charArr);
            
            if(map.containsKey(sortedString)) {
                map.get(sortedString).add(st);
            } else {
                List<String> temp = new ArrayList<>();
                temp.add(st);
                result.add(temp);
                map.put(sortedString, temp);
            }
        }
        
        return result; 
    }
}