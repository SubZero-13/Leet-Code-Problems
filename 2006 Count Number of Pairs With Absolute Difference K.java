 public int countKDifference(int[] nums, int k) {
        int count = 0;
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i+1; j < nums.length; j++)
            {
                int sub = nums[i] - nums[j];
                if(sub < 0)
                {
                    sub = sub * (-1);
                }
                if(sub == k)
                {
                    count++;
                }
            }
        }
        return count;
    }
}