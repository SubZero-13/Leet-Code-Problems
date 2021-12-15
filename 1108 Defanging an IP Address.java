class Solution {
    public String defangIPaddr(String address) {
        String s = "";
for(int i=0;i<address.length();i++){
s+= (address.charAt(i)=='.')?"[.]":address.charAt(i);
}
return s;
    }
}