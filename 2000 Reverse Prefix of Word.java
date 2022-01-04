class Solution {
  public String reversePrefix(String word, char ch) {
     if (!word.contains(String.valueOf(ch))) {
                 return word;
            }
    int index = word.indexOf(String.valueOf(ch));
    StringBuffer str = new StringBuffer(word.substring(0, index + 1));
    return str.reverse().append(word.substring(index + 1, word.length())).toString();
    }
}