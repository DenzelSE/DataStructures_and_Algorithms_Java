public class PrintService {
    private Queue<String> printQueue;

    public PrintService(){
        printQueue =  new Queue();
    }

    public void submitPrintRequest(String document){
        printQueue.enqueue(document);
        System.out.println("print request submitted: "+ document);
    }
    
    public static void main(String[] args) {
        
    }
}
