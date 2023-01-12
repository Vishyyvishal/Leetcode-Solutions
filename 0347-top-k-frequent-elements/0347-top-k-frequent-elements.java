class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(k == nums.length) return nums;
        
        
        Map<Integer, Integer> map = new TreeMap<>();
        for(int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        
        
        
        // low freq         highest freq  
        // [3,       2,       1]
        Queue<Integer> pq = new PriorityQueue<>(
            (node1, node2) -> map.get(node2) - map.get(node1));
        
        
        // adding the key to the priority queue. 
        // pq sorts based on frequency (values of map)
        for(int i : map.keySet()) {
            pq.offer(i);
        }
        
        int[] res = new int[k];

        // PQ is FIFO
        // removes the highest freq occuring number from the pq (head is last)
        // 3, 2, 1
        // 3, 2
        // 3
        for(int i = 0; i < k; i++) {
            res[i] = pq.poll();
        }
        
        
        return res;
    }
}