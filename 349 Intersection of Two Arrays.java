class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean occ[]=new boolean[1001];
		for(int i=0;i<nums1.length;i++) occ[nums1[i]]=true;
		List<Integer> res=new ArrayList<>();
		for(int i=0;i<nums2.length;i++){
			if(occ[nums2[i]]){
				occ[nums2[i]]=false;
				res.add(nums2[i]);
			}
		}
		int result[]=new int[res.size()];
		for(int i=0;i<res.size();i++)   result[i]=res.get(i);
		return result;
    }
}