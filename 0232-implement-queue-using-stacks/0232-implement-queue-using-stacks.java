class MyQueue {
    Stack<Integer> inputStack;
    Stack<Integer> outputStack;

    public MyQueue() {
        inputStack=new Stack<>();
        outputStack=new Stack<>();
    }
    
    public void push(int x) {
        inputStack.push(x);
    }
    
    public int pop() {
        moveInputToOutput();
       return outputStack.pop();
    }
    
    public int peek() {
         moveInputToOutput();
      return  outputStack.peek();
    }
    
    public boolean empty() {
       return (inputStack.isEmpty() && outputStack.isEmpty()) ;
    }
    public void moveInputToOutput(){
        if(outputStack.isEmpty()){
            while(!inputStack.isEmpty()){
                outputStack.push(inputStack.pop());
            }
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */