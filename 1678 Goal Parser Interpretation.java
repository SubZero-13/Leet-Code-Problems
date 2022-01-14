class Solution {
    public String interpret(String command) {
String s1 = command.replace("()","o");
String s2 = s1.replace("(al)","al");
return s2;
    }
}