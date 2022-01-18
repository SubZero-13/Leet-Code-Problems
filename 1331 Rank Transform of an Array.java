class Solution {
    public int[] arrayRankTransform(int[] arr) {
       HashMap<Integer,Integer> map=new HashMap<>();
        int temp[]=arr.clone();
        Arrays.sort(arr);
        int rank=1;
        for(int i:arr) if(!map.containsKey(i)) map.put(i,rank++);
        int result[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
            result[i]=map.get(temp[i]);
        return result; 
    }
}