class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];
        q.add(0);
        while(!q.isEmpty()) {
            int curr = q.poll();
            visited[curr] = true;
            for(int el: rooms.get(curr)) {
                if(!visited[el]) {
                    q.add(el);
                }
            }
        }
        for(boolean el: visited) {
            if(!el) return false;
        }
        
        return true;
    }
}