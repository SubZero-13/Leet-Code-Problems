class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], i);
        }
        int temp[] = new int[nums2.length];
        for(int i = nums2.length-1; i>= 0; i--) {
                while(!st.isEmpty() && st.peek() < nums2[i]) {
                    st.pop();
                }
                if(st.isEmpty()) {
                    temp[i] = -1;
                }
                else {
                    temp[i] = st.peek();
                }
                st.push(nums2[i]);
        }
        int ans[] = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++) {
            int idx = map.get(nums1[i]);
            ans[i] = temp[idx];
        }
        return ans;
      }
}