class Solution {
   public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> map=new HashMap<>();

        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>(
                (a,b)-> a.getValue()-b.getValue()
        );

        pq.addAll(map.entrySet());

        while (!pq.isEmpty() && k>0){
            Map.Entry<Integer,Integer> entry=pq.peek();
            k-=entry.getValue();
            if(k>=0){
                pq.poll();
            }
        }

        return pq.size();

    }
}