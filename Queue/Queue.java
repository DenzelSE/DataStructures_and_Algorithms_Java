public class Queue {
    private static class Node<T> {
    private T data;
    private Node<T> next;

    public Node(T data){
        this.data = data;
    }    
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public boolean isEmpty(){
        return size ==0;
    }
    public int size(){
        return size;
    }
}
