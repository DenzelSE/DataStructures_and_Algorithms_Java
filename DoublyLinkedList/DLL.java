import DoublyLinkedList;
import com.sun.org.apache.xalan.internal.xsltc.runtime.Node;

public class DLL {
    private Node head;
    private Node tail;
    
    public DLL(){}
    public void append(int data){
        Node newNode = new Node(data);
        if (tail == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        };
}
