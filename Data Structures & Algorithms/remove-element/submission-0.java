class Solution {
    public int removeElement(int[] nums, int val) {

        int lp = 0;

        for(int i=0; i<nums.length; i++){

            if(nums[i] != val){
                nums[lp] = nums[i];
                lp++;
            }
        }

        return lp;
        
    }
}