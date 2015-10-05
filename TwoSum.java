public class Solution {
    public int isNumPresent(int a[],int num)
    {
        for(int  i =0;i<a.length;i++)
        {
            if(a[i] == num)
             return i;
        }
        return -1;
    }
    public int[] twoSum(int[] nums, int target) {
        
        for(int i =0;i<nums.length;i++)
        {
            int index1  = i;
            int index2 = isNumPresent(nums,target-nums[i]);
            
            if(index2 != -1 && index1 > index2)
            {
                int []output = new int[2];
                output[1] = index1+1;
                output[0] = index2+1;
                return output;
            }
        }
        
        return null;
    }
}