class Solution {
    public int[] sortArray(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        mergeSort(nums, i, j);
        return nums;
    }
    public void mergeSort(int a[], int p, int q)
    {
        if(p == q)
        {
            return;
        }
        
            int mid = (p+q)/2;
            mergeSort(a, p, mid);
            mergeSort(a, mid+1, q);
            merge(a,p,mid,q);
    }
    public void merge(int a[], int p, int mid, int q)
    {
        int i = p;
        int j = mid+1;
        int k = 0;
        int B[] = new int[(q-p)+1];
        while(i <= mid && j <= q)
        {
            if(a[i] <= a[j])
            {
                B[k] = a[i];
               
                i++;
            }
            else
            {
                B[k] = a[j];
                j++;
            }
             k++;
        }
        while(i <= mid)
        {
            B[k] = a[i];
            k++;
            i++;
        }
        while(j <= q)
        {
            B[k] = a[j];
            k++;
            j++;
        }
        i = p;
        for(int m = 0; m < B.length; m++)
        {
            a[i] = B[m];
            i++;
        }
    }
}