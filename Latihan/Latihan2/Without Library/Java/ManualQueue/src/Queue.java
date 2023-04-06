public class Queue {
    private int maxSize;
    private Object[] queueArray;
    private int front;
    private int rear;
    private int currentSize;

    public Queue(int s) {
        maxSize = s;
        queueArray = new Object[maxSize];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    public void enqueue(Object item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear++;
        queueArray[rear] = item;
        currentSize++;
    }

    public Object dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        Object item = queueArray[front];
        front++;
        currentSize--;
        return item;
    }

    public Object element() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        return queueArray[front];
    }

    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return queueArray[front];
    }

    public Object poll() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        }
        Object item = queueArray[front];
        front++;
        currentSize--;
        return item;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public int size() {
        return currentSize;
    }
}
