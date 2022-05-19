class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if(strs == null || strs.length == 0) return result;
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for(String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            ArrayList<String> list = map.getOrDefault(sorted, new ArrayList<>());
            list.add(str);
            map.put(sorted, list);
        }
        for(Map.Entry<String, ArrayList<String>> entry : map.entrySet()) {
            result.add(entry.getValue());
        }
        return result;
    }
}