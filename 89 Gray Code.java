class Solution {
    public List<String> generate(int n) {
        if(n == 1) {
            List<String> bgCode = new ArrayList<>();
            bgCode.add("0");
            bgCode.add("1");
            return bgCode;
        }
        List<String> mStr = generate(n-1);
        List<String> mRes = new ArrayList<>();
        for(int i  = 0; i < mStr.size(); i++) {
            mRes.add("0" + mStr.get(i));
        }
        for(int i  = mStr.size()-1; i >= 0; i--) {
            mRes.add("1" + mStr.get(i));
        }
        return mRes;
    }
    public List<Integer> grayCode(int n) {
        List<String> gCode = generate(n);
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < gCode.size(); i++) {
            ans.add(Integer.parseInt(gCode.get(i), 2));
        }
        return ans;
     }
}