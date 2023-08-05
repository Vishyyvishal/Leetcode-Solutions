class Solution {
    public int numRabbits(int[] answers) {
        Map <Integer, Integer> map = new HashMap();
        int count = 0;
        for(int num: answers){
            if(num == 0){
                count++;
            }else if(map.getOrDefault(num, 0) == 0){
                map.put(num, 1);
                count+= num +1;
            }else{
                map.put(num, map.get(num) +1);
                if(map.get(num) > num){
                    map.put(num, 0);
                }
            }
            //map.put(a, map.getOrDefault(a, 0) +1);
        }

        System.out.println("Count  " +  count);
        System.out.println("Map  " +  map.toString());
        return count;


    }
}