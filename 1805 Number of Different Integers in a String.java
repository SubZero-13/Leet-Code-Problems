class Solution {
    public int numDifferentIntegers(String word) {
        return Arrays.stream(word.replaceAll("[a-z]+", " ").split(" "))
                .filter(s -> !"".equals(s))
                .map(s -> s.replaceFirst("^0+", ""))
			    .collect(Collectors.toSet())
                .size();
    }
}