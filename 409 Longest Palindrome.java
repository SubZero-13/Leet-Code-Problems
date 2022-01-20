 Set<Character> hSet = new HashSet();
    int sum = 0;
    for(int i = 0; i< s.length() ; i++) {
        
        if(!hSet.contains(s.charAt(i))) 
            hSet.add(s.charAt(i));
        else {
            sum += 2;
            hSet.remove(s.charAt(i));   
        }
        
    }
    
    if(!hSet.isEmpty())  sum++;
         
    return sum;