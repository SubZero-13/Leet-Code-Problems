class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < piles.length; i++) {
            pq.add(piles[i]);
        }
        while(k-- > 0) {
            int ele = pq.poll();
            if(ele % 2 == 0) {
                ele /= 2;
            }
            else {
                ele = (ele/2)+1;
            }
            pq.add(ele);
        }
        int sum = 0;
        while(!pq.isEmpty()) {
            sum += pq.poll();
        }
        return sum;
    }
}