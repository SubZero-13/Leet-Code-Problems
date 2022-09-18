class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
       ArrayList<Integer> ans = new ArrayList<>();
       TreeMap<Integer, Integer> map = new TreeMap<>();
       Queue<Pair> q = new LinkedList<>();
       Pair p = new Pair(0, root);
       q.add(p);
       while(!q.isEmpty()) {
           int size = q.size();
           for(int i = 0; i < size; i++) {
               Pair t = q.poll();
               int col = t.col;
               Node temp = t.node;
               if(!map.containsKey(col)) {
                   map.put(col, temp.data);
               }
               if(temp.left != null) {
                   Pair pr = new Pair(col-1, temp.left);
                   q.add(pr);
               }
               if(temp.right != null) {
                   Pair pr = new Pair(col+1, temp.right);
                   q.add(pr);
               }
           }
       }
       for(int key: map.keySet()) {
           ans.add(map.get(key));
       }
       return ans;
    }
    
    static class Pair {
        int col;
        Node node;
        Pair(int col, Node node) {
            this.col = col;
            this.node = node;
        }
    }
    
}