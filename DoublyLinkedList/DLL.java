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
        }
    public void prepend(int data){
        Node newNode = new Node(data);

        if(head==null){
            head = newNode;
            tail = newNode; 
        }
        else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        }

    public void delete(int key){
        Node current = head;

        while (current != null) {
            if(current.data == key){
                if(current.prev != null){
                    current.prev.next = current.next;
                }
                else {
                    head = current.next;
                }
                if (current.next != null){
                    current.next.prev = current.prev;
                }
                else {
                    tail = current.prev;
                }
            }
            current = current.next;
        }
    }
    public void printList(){
        Node current = head;
        while (current != null) {
            System.out.println(current.data + "");
            current = current.next;
        }
        System.out.println();
    }
}

