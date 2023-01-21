class Solution {

    // BackTracking Solution
    private List<String> ipes;
    private int l;
    public List<String> restoreIpAddresses(String s) {
        ipes = new ArrayList<>();
        l = s.length();
        f(s, 0, "", 0);
        return ipes;
    }
    
    private boolean isIp(String ip){
        if(ip.length() > 3 || ip.length() == 0) return false;
        if(ip.length() > 1 && ip.charAt(0) == '0') return false;
        if(ip.length() > 0 && Integer.parseInt(ip) > 255) return false;
        return true; 
    }

    private void f(String s, int index, String ip, int dot){
        //base case
        if(dot == 3){
            if(isIp(s.substring(index))) {
                ip += s.substring(index);
                ipes.add(ip);
            }
            return;
        }

        //do all the stuff
        for(int i = index; i < l; i++){
            if(isIp(s.substring(index, i +1))){
                int k = s.substring(index, i+1).length();
                ip += s.substring(index, i+1) + ".";
                f(s, i+1, ip, dot+1);
                ip = ip.substring(0, ip.length() - k -1);
            }
        }
    }

    // Iterative Solution
    // public List<String> restoreIpAddresses(String s) {
    //     List<String> res = new ArrayList<>();
    //     for(int i = 1; i < 4; i++) {
    //         for(int j = 1; j < 4; j++) {
    //             for(int k = 1; k < 4; k++) {
    //                 for(int l = 1; l < 4; l++) {
    //                     StringBuffer ip = new StringBuffer();
    //                     if(i+j+k+l == s.length()) {
    //                         int n1 = Integer.parseInt(s.substring(0, i));
    //                         int n2 = Integer.parseInt(s.substring(i, i+j));
    //                         int n3 = Integer.parseInt(s.substring(i+j, i+j+k));
    //                         int n4 = Integer.parseInt(s.substring(i+j+k));
    //                         if(n1 <= 255 && n2 <= 255 && n3 <= 255 && n4 <= 255) {
    //                             ip.append((n1 + "." + n2 + "." + n3 + "." + n4));
    //                             if(ip.length() == s.length()+3) res.add(ip.toString());
    //                         }
    //                     }
    //                 }
    //             }
    //         }
    //     }
    //     return res;
    // }
}