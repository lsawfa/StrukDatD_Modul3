import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan input: ");
        String text = inputUser.next();
        Stack theStack = new Stack(text.length());

        char[] textchar = text.toCharArray();
        for (char c : textchar) {
            theStack.push(c);
        }

        System.out.print("Reserved: ");
        while (!theStack.isEmpty()){
            char value = theStack.pop();
            System.out.print(value);
        }
    }
}
