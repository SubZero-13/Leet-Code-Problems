class Solution {

    public int convertTime(String current, String correct) {
        int count = 0;
        int a1 = Integer.valueOf(current.substring(0, 2)), a2 = Integer.valueOf(correct.substring(0, 2));
        int a3 = Integer.valueOf(current.substring(3)), a4 = Integer.valueOf(correct.substring(3));
        if (a4 > a3) {
            int sixty = a2 - a1;
            int fifteen = (a4 - a3) / 15;
            int fith = (a4 - fifteen * 15 - a3) / 5;
            int one = a4 - fifteen * 15 - a3 - fith * 5;
            count = fifteen + fith + one + sixty;
        } else if (a4 < a3) {
            int sixty = a2 - a1 - 1;
            a4 += 60;
            int fifteen = (a4 - a3) / 15;
            int fith = (a4 - fifteen * 15 - a3) / 5;
            int one = a4 - fifteen * 15 - a3 - fith * 5;
            count = fifteen + fith + one + sixty;
        } else {
            count = a2 - a1;
        }
        return count;
    }
}