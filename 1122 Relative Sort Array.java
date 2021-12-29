class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
      int[] freq = new int[1001];
    
    int[] ans = new int[arr1.length];
    
    for(int i : arr1) freq[i]++;
    
    int idx =0;
    
    for(int i=0; i<arr2.length;){
        
        if(freq[arr2[i]] > 0){
            ans[idx] = arr2[i];
            idx++;
            freq[arr2[i]]--;
        }
        else{
            i++;
        }
        
    }
    
    for(int i =0; i<1001;){
        if(freq[i] > 0){
            ans[idx] = i;
            idx++;
            freq[i]--;
        }else{
            i++;
        }
    }
    
    return ans;
    
  }
}