class Solution {
    public int findDuplicate(int[] nums) {
        int fast=0;//快指针
        int slow=0;//慢指针
        do{
            slow=nums[slow];
            fast=nums[nums[fast]];
        }while(slow!=fast);
        fast=0;
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        };
        return fast;
    }
}