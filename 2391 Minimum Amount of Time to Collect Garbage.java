class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int ans = 0;
        int pLastIdx = 0;
        int gLastIdx = 0;
        int mLastIdx = 0;
        for(int i = 0; i < garbage.length; i++) {
            ans += garbage[i].length();
            for(char ch: garbage[i].toCharArray()) {
                if(ch == 'P') pLastIdx = i;
                else if(ch == 'G') gLastIdx = i;
                else if(ch == 'M') mLastIdx = i; 
            }
        }
        for(int i = 1; i < travel.length; i++) {
            travel[i] += travel[i-1];
        }
        
        ans += pLastIdx == 0 ? 0 : travel[pLastIdx-1];
        ans += gLastIdx == 0 ? 0 : travel[gLastIdx-1];
        ans += mLastIdx == 0 ? 0 : travel[mLastIdx-1]; 
        return ans;

    //     int n = garbage.length;
    //     int m = 0, g = 0, p = 0;
    //    for(int i = n-1; i >= 0; i--) {
    //        int mcount = 0, pcount = 0, gcount = 0;
    //        for(int  j = 0; j < garbage[i].length(); j++) {
    //            char ch = garbage[i].charAt(j);
    //            if(ch == 'M') {
    //                mcount += 1;
    //            }
    //            if(ch == 'G') {
    //                gcount += 1;
    //            }
    //            if(ch == 'P') {
    //                pcount += 1;
    //            }
    //        }
    //        if(i != 0) {
    //             if(mcount != 0 || m != 0) {
    //                 m += (mcount + travel[i-1]);
    //             }
    //             if(gcount != 0 || g != 0) {
    //                 g += (gcount + travel[i-1]);
    //             }
    //             if(pcount != 0 || p != 0) {
    //                 p += (pcount + travel[i-1]);
    //             }
    //        }
    //        else {
    //            m += (mcount);
    //            p += (pcount);
    //            g += (gcount);
    //        }
    //    } 
    //     int ans = m + p + g;
    //     return ans;
    }

}