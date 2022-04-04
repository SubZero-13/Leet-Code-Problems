class Solution {
    public double average(int[] salary) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int i = 0; i < salary.length; i++) {
            if(min > salary[i]) {
                min = salary[i];
            }
            if(max < salary[i]) {
                max = salary[i];
            }
            sum += salary[i];
        }
        sum = sum - min - max;
        double avg = sum / ((salary.length-2)*1.0d);
        return avg;
    }
}