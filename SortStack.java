import java.util.Stack;
public class SortStack {

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(30);
        stack.push(200);
        stack.push(80);
        stack.push(100);
        stack.push(5);
        System.out.println("Stack Before sort");
        System.out.println(stack);
        sortStack(stack);
        System.out.println("Stack After sort");
        System.out.println(stack);
    }
    
    public static void sortStack(Stack<Integer> s){

        if(!s.isEmpty()){
            int temp=s.pop();
            sortStack(s);
            insertElement(s,temp);
        }
    }

    public static void insertElement(Stack<Integer> t,int item){

        if(t.isEmpty() || item> t.peek()){
            t.push(item);
        }
        else{
            int temp=t.pop();
            insertElement(t,item);
            t.push(temp);
        }
    }
}