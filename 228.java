class Solution {
    public List<String> summaryRanges(int[] nums) {
        int top=-99999;
        int bottom=-99999;
        List <String> result=new ArrayList<>();
        Stack <Integer> stack = new Stack<>();
        if(nums.length==0){
            return result;
        }
        for(int temp = 0;temp < nums.length;temp ++){
            if(stack.isEmpty()){
                stack.push(nums[temp]);
            }else{
                if(nums[temp]==stack.peek()+1){
                    stack.push(nums[temp]);
                }else{
                    top=stack.pop();
                    if(stack.isEmpty()){
                        result.add(String.valueOf(top));
                        stack.push(nums[temp]);
                    }else{
                        while(!stack.isEmpty()){
                            bottom=stack.pop();
                        }
                        if(bottom==-99999){
        		            result.add(String.valueOf(top));
        	            }else
                        result.add(String.valueOf(bottom)+"->"+String.valueOf(top));
                        top=-99999;
                        bottom=-99999;
                        stack.push(nums[temp]);
                    }
                }
            }
        }
        if(!stack.isEmpty())
        {
        	top=stack.pop();
        	 while(!stack.isEmpty()){
                 bottom=stack.pop();
             }
        if(bottom==-99999){
        		 result.add(String.valueOf(top));
        	 }else
        	 result.add(String.valueOf(bottom)+"->"+String.valueOf(top));
        }
        return result;
    }
}