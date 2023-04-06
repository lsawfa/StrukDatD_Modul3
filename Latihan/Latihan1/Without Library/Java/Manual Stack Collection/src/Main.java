public class Main {
    public static void main(String[] args) {
        Stack theStack = new Stack(10);

        theStack.push("Aku");
        theStack.push("Anak");
        theStack.push("Indonesia");

        System.out.println("Next : "+theStack.peek());
        theStack.push("Raya");
        System.out.println(theStack.pop());
        theStack.push("!");

        int count = theStack.search("Aku");
        while (count != -1 && count > 1){
            theStack.pop();
            count--;
        }
        System.out.println(theStack.pop());
        System.out.println(theStack.isEmpty());
    }
}
