import java.util.Arrays;
import java.util.Stack;

public class NextGreater {
    

public static int[] findNextElement(int [] t){
    int [] temp=new int[t.length];
    Stack<Integer> s=new Stack<>();
    for(int i=t.length-1;i>=0;i--){
    while(!s.isEmpty() && s.peek()<=t[i]){
        s.pop();
    }
    if(s.isEmpty()){
        temp[i]=-1;
    }
    else{
        temp[i]=s.peek();
    }
    s.push(t[i]);
    }
    return temp;
}

public static void main(String[] args) {
    int [] a={2,5,3,25,35};
    int [] result=findNextElement(a);
    System.out.println(Arrays.toString(a));
    System.out.println(Arrays.toString(result));
}
}
