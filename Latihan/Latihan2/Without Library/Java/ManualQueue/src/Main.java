public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(10);
        queue.enqueue("Java");
        queue.enqueue("DotNet");
        queue.enqueue("PHP");
        queue.enqueue("HTML");
        System.out.println("poll: " + queue.poll());
        System.out.println("element: " + queue.element());
        System.out.println("poll: " + queue.poll());
        System.out.println("peek: " + queue.peek());
    }
}
