class Solution {
    public int findComplement(int num) {
        		boolean flag=false;
		StringBuilder binaryNum=new StringBuilder(Integer.toBinaryString(num));
		for(int i=0;i<binaryNum.length();i++){
			if(binaryNum.charAt(i)=='1'){
				flag=true;
			}
			if(flag){
				binaryNum.setCharAt(i,binaryNum.charAt(i)=='1'?'0':'1');
			}
		}
		return Integer.valueOf(binaryNum.toString(),2);
    }
}