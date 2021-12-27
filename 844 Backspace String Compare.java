class Solution {
      public boolean backspaceCompare(String s, String t) {
        
        return buildString(s).equals(buildString(t));
    }
    
    private String buildString(String s){
        
        Stack<Character> result = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            
            if(s.charAt(i) != '#')
                result.push(s.charAt(i));
            
            else if(!result.empty())
                result.pop();
        }
        
        return String.valueOf(result);
    }
}