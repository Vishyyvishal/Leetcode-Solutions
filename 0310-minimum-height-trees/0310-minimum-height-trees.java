class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        // edge case
        if(n == 1 ) {
            return List.of(0);
        }
        List<Integer> res = new ArrayList<>();

        // what is a leaf node: indegree of 1 
        int[] indegree = new int[n];
        // key: node || value: neighbors
        Map<Integer, List<Integer>> map = new HashMap<>();

        // the skeleton graph, don't have to worry ab nulls n shit
        for(int i = 0; i < n; i++) {
            map.put(i, new ArrayList<>());
        }

        // connect the graph and it's indegrees
        for(int[] edge : edges) {
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
            indegree[edge[0]]++;
            indegree[edge[1]]++;
        }

        // finding the leaf nodes
        for(int i = 0; i < n; i++) {
            if(indegree[i] <= 1) {
                res.add(i);
            }
        }
        
        int nodesTouched = res.size();

        // find the leaf nodes' neighbors
        while(nodesTouched < n) {
            // tracks the next layer 
            List<Integer> temp = new ArrayList<>();

            // go thru outer layer 
            for(int i = 0; i < res.size(); i++) {
                for(int neighbor : map.get(res.get(i))) {
                    indegree[neighbor]--;
                    if(indegree[neighbor] == 1) {
                        temp.add(neighbor);
                    }
                }
            }

            nodesTouched += temp.size();
            res = temp;

        }

        return res;
    }
}


// Time: O(N^3) 