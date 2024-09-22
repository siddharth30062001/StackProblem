import java.util.*;

class MinStack {

    private Stack<Integer> minstack;
    private Stack<Integer> mainstack;

    MinStack(){
        minstack=new Stack<>();
        mainstack=new Stack<>();
    }

    public void push(int x){
        mainstack.push(x);

        if(minstack.isEmpty() || x<=minstack.peek()){
            minstack.push(x);
        }

    }

    public void pop(){
        if(!mainstack.isEmpty()){
            int popped=mainstack.pop();
            if(popped==minstack.peek()){
                minstack.pop();
            }
        }
    }

    public int top(){
        return mainstack.peek();
    }

    public int getMin(){
        return minstack.peek();
    }

    public static void main(String[] args) {
        MinStack minStack=new MinStack();
        minStack.push(3);
        minStack.push(5);
        System.out.println(minStack.getMin());
        minStack.push(2);
        minStack.push(1);
        System.out.println("Min Element: " + minStack.getMin());  // Output: 1
        minStack.pop();
        System.out.println("Min Element: " + minStack.getMin());  // Output: 2
        minStack.pop();
        System.out.println("Top Element: " + minStack.top());   

    }
    
}