public class Stack {
    private int maxSize;
    private String[] stackArrays;
    private int top;

    public Stack(int a){
        maxSize=a;
        stackArrays = new String[maxSize];
        top = -1;
    }

    public void push(String j){
        stackArrays[++top] = j;
    }
    public String pop(){
        return stackArrays[top--];
    }
    public String peek(){
        return stackArrays[top];
    }
    public boolean isEmpty(){
        return (top==-1);
    }
    public boolean isFull() {
        return (top == maxSize - 1);
    }
    public int search(String value) {
        for (int i = top; i >= 0; i--) {
            if (stackArrays[i].equals(value)) {
                return top - i + 1;
            }
        }
        return -1;
    }
}