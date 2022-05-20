class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // key: element value: frequency of element
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        
        // Build a heap of size k using N elements
        Queue<Integer> heap = new PriorityQueue<>((n1, n2) -> map.get(n1) - map.get(n2));
        
        for(int num : map.keySet()) {
            heap.add(num);
            if(heap.size() > k) {
                heap.poll();
            }
        }
        
        int[] top = new int[k];
        for(int i = k - 1; i >= 0; i--) {
            top[i] = heap.poll();
        }
        
        return top;
    }
}