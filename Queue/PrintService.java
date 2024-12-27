public class PrintService {
    private Queue<String> printQueue;

    public PrintService(){
        printQueue =  new Queue();
    }

    public void submitPrintRequest(String document){
        printQueue.enqueue(document);
        System.out.println("print request submitted: "+ document);
    }

    public void processPrintRequest(){

        while(!printQueue.isEmpty()){
            String doc = printQueue.dequeue();
            System.out.println("Printing document: "+ doc);
        }
        System.out.println("All documents are printed");
    }
    
    // public static void main(String[] args) {
    //     PrintService printService = new PrintService();

    //     printService.submitPrintRequest("doc 1");
    //     printService.submitPrintRequest("doc 2");
    //     printService.submitPrintRequest("doc 3");
    //     printService.submitPrintRequest("doc 4");
        
    // }
}
