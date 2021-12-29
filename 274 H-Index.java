class Solution {
    public int hIndex(int[] citations) {
        int arr[]=new int[1001];
        
        for(int i=0;i<citations.length;i++){
            arr[citations[i]]++;
        }
        
        for(int i=999;i>=0;i--){
            arr[i]=arr[i+1]+arr[i];
            if(arr[i]>=i){
                return i;
            }
        }
        return 0;
    }
}