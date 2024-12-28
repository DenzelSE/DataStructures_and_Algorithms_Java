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
    
}
