class Solution {
    // Approach 1: Binary Search
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int i = 0, j = arr.length-k;
        while(i < j) {
            int mid = (i+j)/2;
            if(x-arr[mid] > arr[mid+k]-x) {
                i = mid+1;
            }
            else {
                j = mid;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int idx = i; idx < i+k; idx++) {
            ans.add(arr[idx]);
        }
        return ans;
        
    }
    
    //Approach 2 :- Uisng Two Pointer T.C = O(n)
    // public List<Integer> findClosestElements(int[] arr, int k, int x) {
    //     int i = 0, j  = arr.length-1;
    //     while(j-i >= k) {
    //         if(x-arr[i] <= arr[j]-x) {
    //             j--;
    //         }
    //         else {
    //             i++;
    //         }
    //     }
    //     List<Integer> ans = new ArrayList<>();
    //     for(int idx = i; idx <= j; idx++) {
    //         ans.add(arr[idx]);
    //     }
    //     return ans;
    // }
    
    
    // Approach 3 : - Uisng Priority Queue T.C=O(nlogk)
//     public List<Integer> findClosestElements(int[] arr, int k, int x) {
//         List<Integer>ans = new ArrayList<>();
//         PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
//         for(int i = 0; i < arr.length; i++) {
//             Pair p = new Pair(arr[i], Math.abs(x-arr[i]));
//             if(pq.size() < k) {
//                 pq.add(p);
//             }
//             else {
//                 if(pq.peek().gap > p.gap) {
//                     pq.remove();
//                     pq.add(p);
//                 }
//             }
//         }
//         while(pq.size() > 0) {
//             Pair temp = pq.remove();
//             ans.add(temp.val);
//         }
//         Collections.sort(ans);
//         return ans;
        
//     }
//     class Pair implements Comparable<Pair> {
//         int val, gap;
//         Pair(int val, int gap) {
//             this.val = val;
//             this.gap = gap;
//         }
//         public int compareTo(Pair o) {
//             if(this.gap == o.gap) {
//                 return this.val-o.val;
//             }
//             else {
//                 return this.gap-o.gap;
//             }
//         }
        
//     }
}