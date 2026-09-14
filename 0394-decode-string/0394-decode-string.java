class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack=new Stack<>();
        Stack<StringBuilder> stringStack=new Stack<>();
        StringBuilder string=new StringBuilder();

        int currentNum=0;

        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                currentNum=currentNum*10+(ch-'0');
            }else if(ch=='['){
                countStack.push(currentNum);
                stringStack.push(string);
                currentNum=0;
                string=new StringBuilder();
            }else if(ch==']'){
                StringBuilder decodedString=stringStack.pop();
                int k= countStack.pop();
                for(int i=0;i<k;i++){
                    decodedString.append(string);
                }
                string=decodedString;
            }else{
                string.append(ch);
            }
        }
        return string.toString();
    }
}