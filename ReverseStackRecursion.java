import java.util.Stack;

class ReverseStackRecursion {
  
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(30);
        s.push(20);
        s.push(80);
        s.push(100);
        s.push(5);
        System.out.println("Stak before reverse");
        System.out.println(s);
        reverseStack(s);
        System.out.println("Stack After reverse");
        System.out.println(s);
        
    }

    public static void insertAtBottom(Stack<Integer> m,int item){

        if(m.isEmpty()){
            m.push(item);
        }
        else{
            int temp=m.pop();
            insertAtBottom(m, item);
            m.push(temp);
        }
    }
    
    public static void reverseStack(Stack< Integer> t){
         
        if(!t.isEmpty()){
            int temp=t.pop();
            reverseStack(t);
            insertAtBottom(t,temp);
        }
            

        
    }
}