class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n= nums.length;
        boolean flag=true;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if (nums[i]==nums[j])
                {
                    flag=false;
                    break;
                }
            }
        }
       
       if(!flag)
       {
        return true; 
       }
       else
       {
        return false;
       }

    }
}