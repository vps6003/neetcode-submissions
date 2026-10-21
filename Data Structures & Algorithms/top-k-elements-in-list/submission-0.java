class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>map = new HashMap<>();

        PriorityQueue<Integer>pq = new PriorityQueue<>(
           (a,b) -> map.get(a) - map.get(b)
        );

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            pq.offer(entry.getKey());

            if(pq.size() > k) pq.poll();
        }

        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = pq.poll();
        }

        return ans;

    }
}
