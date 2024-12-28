import java.util.Stack;

public class QueueImp {
    //implementing Queue using stacks
    
    private Stack <Integer> inStack;
    private Stack <Integer> outStack;

    public QueueImp(){
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    public void push(int x){
        inStack.push(x);
    }

    public int peek(){
        if(outStack.isEmpty()){
            while(!outStack.isEmpty()){
                outStack.push(inStack.pop());
            }
        }
        return outStack.peek();
    }
    
}
