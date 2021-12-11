class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length == 0 || arr.length == 1 || arr.length == 2)
        {
            return false;
        }
        if(arr[1] <= arr[0])
        {
            return false;
        }
        int count = 0;
        int max = 0;
        for(int i = 1; i < arr.length-1; i++)
        {
            if(arr[i] == arr[i+1])
            {
                return false;
            }
            if(arr[i] > arr[i+1])
            {
                count++;
                max = i;
                break;
            }
        }
        if(count != 0)
        {
            for(int i = max+1; i < arr.length-1; i++)
            {
                if(arr[i] <= arr[i+1])
                {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}