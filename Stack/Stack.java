public class Stack <T> {
    private static class Node <T> {
        private T data;
        private Bode <T> next;

        public Node( T data){
            this.data = data;
        }

    }

    private Node <T> top;

    public void push(T data){
        Node <T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
    }

}
