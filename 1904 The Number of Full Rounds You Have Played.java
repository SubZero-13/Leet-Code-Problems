class Solution {
    public int numberOfRounds(String loginTime, String logoutTime) {
        String[] start = loginTime.split(":");
    String[] end = logoutTime.split(":");
    
    int startHour = Integer.parseInt(start[0]);
    int startMinute = Integer.parseInt(start[1]);
    int endHour = Integer.parseInt(end[0]);
    int endMinute = Integer.parseInt(end[1]);
    
    int totalRounds = 0;
    int hourDiff = 0;
    if(startHour > endHour)
    {
        hourDiff = (24-startHour) + endHour;
    }
    else if(endHour > startHour)
    {
        hourDiff = endHour - startHour;
    }
    else if(startMinute > endMinute)
    {
        hourDiff = 24;
    }
    else
    {
        hourDiff = 0;
    }
    
    if(hourDiff >= 1)
    {
        totalRounds += (hourDiff-1)*4;
        if(startMinute == 0)
        {
            totalRounds += 4;
        }
        else if(startMinute <= 15)
        {
            totalRounds += 3;
        }
        else if(startMinute <= 30)
        {
            totalRounds += 2;
        }
        else if(startMinute <= 45)
        {
            totalRounds += 1;
        }
    
        if(endMinute >= 45)
        {
            totalRounds += 3;
        }
        else if(endMinute >= 30)
        {
            totalRounds += 2;
        }
        else if(endMinute >= 15)
        {
            totalRounds += 1;
        }
    }
    else
    {
        if(startMinute == 0 && endMinute >= 15)
        {
            totalRounds += 1;
        }
        
        if(startMinute <= 15 && endMinute >= 30)
        {
            totalRounds += 1;
        }
        
        if(startMinute <= 30 && endMinute >= 45)
        {
            totalRounds += 1;
        }
    }
    
    return totalRounds;
    }
}