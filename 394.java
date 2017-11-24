class Solution {
    public String decodeString(String s) {
        int length=s.length();
        char ch[] = s.toCharArray();
        int count = 0;
        String currentString = "";
        Stack<Integer> counts = new Stack<Integer>();
        Stack<String> strings = new Stack<String>();
        StringBuilder result = new StringBuilder();
        for(int i = 0;i < length;i ++){
            if(ch[i]>='0' && ch[i]<='9'){
                count = count * 10;
                count = count + ch[i] - '0';
            }else if(ch[i] == '['){
                counts.push(count);
                count = 0;
                strings.push(currentString);
                currentString = "";         
            }else if(ch[i] >= 'a' && ch[i] <= 'z'){
                if(counts.isEmpty()){
                    result.append(ch[i]);
                }
                else
                    currentString+=ch[i];
            }else if(ch[i]==']'){
                int time=counts.pop();
                if(counts.isEmpty()){
                    for(int j=0;j<time;j++){
                        result.append(currentString);
                    }
                    currentString = strings.pop();
                }else{
                    String tmp="";
                    for(int j=0;j<time;j++){
                        tmp+=currentString;
                    }
                    currentString = strings.pop()+tmp;
                }
            }
        }
        return result.toString();
    }
}