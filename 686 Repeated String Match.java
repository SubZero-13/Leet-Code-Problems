class Solution {
    public int repeatedStringMatch(String a, String b) {
        int repeat =0;
        StringBuilder str = new StringBuilder();
        
        while(str.length()<b.length()){
            str.append(a);
            repeat++;
        }
        
        if(str.indexOf(b)==-1){
            str.append(a);
            repeat++;
        }
        
        if(str.indexOf(b)==-1){
            return -1;
        }
        
        return repeat;
    }
}