class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean out = false;
        int j = nums.length;

        for (int i=0; i<j; i++)
            {
                for (int z=i+1; z<j; z++)
                {
                    if (nums[i] == nums[z])
                        {
                            out = true;
                            break;
                        }
                }
                if (out == true)
                    break;
            }

        return out;
        
    }
}