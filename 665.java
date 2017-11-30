class Solution {
    int count=0;
    public boolean checkPossibility(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                count++;
                if(i>=1){
                    if(nums[i-1]>nums[i+1]){
                        nums[i+1]=nums[i];
                    }else{
                        nums[i]=nums[i+1];
                    }
                }else{
                    continue;
                }
            }
        }
        if(count>1){
                return false;
        }else{
            return true;
        }
    }
}