class Solution {
    public int majorityElement(int[] nums) {
        return helper(nums);
    }

    private int helper(int []nums){
        int count = 1;
        int ans = nums[0];

        for(int i= 1; i<nums.length;i++){
            if(nums[i] == ans){
                count++;
            }
            else{
                if(count <= 0){
                    count = 1;
                    ans = nums[i];
                }
                else{
                    count--;
                }
            }
        }
        return ans;
    }
}