class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0, cows = 0;
        int[] secFreq = new int[10];
        int[] guessFreq = new int[10];
        for(int i = 0; i < secret.length(); i++) {
            int sec = Character.getNumericValue(secret.charAt(i));
            int g = Character.getNumericValue(guess.charAt(i));
            if(sec == g) bulls += 1;
            else {
                secFreq[sec]++;
                guessFreq[g]++;
            }
        }
        for(int i = 0; i < 10; i++) {
            if(secFreq[i] > 0 && guessFreq[i] > 0) {
                cows += Math.min(secFreq[i], guessFreq[i]);
            }
        }
        return bulls + "A" + cows + "B"; 
    }
}