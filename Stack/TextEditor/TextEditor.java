public class TextEditor {
    private StringBuilder document;
    private Stack<Integer> undStack;

    public TextEditor(){
        this.document - new StringBuilder();
        this.undStack = new Stack();

    }
    public void insert(String text){
        document.append(text);
        undStack.push(text.length());
    }
    public void unde(){
        if(!undStack.isEmpty()){
            int length = undStack.pop();
            document.delete(document.length()- length, document.length());
        }
    }
    public void printDocument() {
		System.out.println(document);
	}
	
	public static void main(String[] args) {
		TextEditor editor = new TextEditor();
		
		editor.insert("Hello ");
		editor.insert("World!");
		editor.printDocument();
		
		editor.undo();
		editor.printDocument();

	}


}
