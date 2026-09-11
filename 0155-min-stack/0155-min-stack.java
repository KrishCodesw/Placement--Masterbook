class MinStack {

    // Approach - Using an auxillary stack to maintain the minimum  
    // Push x onto the main stack. For the auxiliary stack, compare $x$ with the current top of the auxiliary stack. If the auxiliary stack is empty or $x$ is less than or equal to the current minimum, push $x$ onto the auxiliary stack. Otherwise, push the current minimum again to keep both stacks perfectly aligned in height.

     private Stack<Integer> stack;
     private Stack<Integer> minStack;
    public MinStack() {
       stack=new Stack<>();
       minStack=new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack.isEmpty() || val<= minStack.peek()){
            minStack.push(val);
        }
        // else{
            // minStack.push(minStack.peek());
        // }
    }
    
    public void pop() {
        if(stack.peek().equals(minStack.peek())){
    minStack.pop();
        }
        stack.pop();
    
    }
    
    public int top() {
       return stack.peek(); 
    }
    
    public int getMin() {
       return minStack.peek(); 
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */