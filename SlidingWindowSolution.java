public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
     int startPos = 0;
     int maxNu = 0;
     ArrayList <Integer> output = new ArrayList<Integer>();
     
     while((startPos+k) <= nums.length && nums.length > 0 )
     {
         maxNu = nums[startPos];
         for(int i=startPos ;i<(startPos+k) ; i++ )
         {
             if(nums[i] > maxNu)
               maxNu = nums[i];
         }
         output.add(maxNu);
         
         startPos++;
     }
     
     int out[] = new int[output.size()];
     for (int i =0;i<output.size();i++)
        out[i] = output.get(i);
        
     return out;
    }
}