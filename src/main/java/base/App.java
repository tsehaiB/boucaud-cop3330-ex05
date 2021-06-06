package base;
import java.util.Scanner;
public class App {
    Scanner inp = new Scanner(System.in);
    public static void main(String args[]){
        App myApp = new App();
        int x = myApp.readNum("first");
        int y = myApp.readNum("second");
        System.out.println(
                x + " + " + y + " = " + myApp.doOperation(x, y, '+') + "\n" +
                x + " - " + y + " = " + myApp.doOperation(x, y, '-') + "\n" +
                x + " * " + y + " = " + myApp.doOperation(x, y, '*') + "\n" +
                x + " / " + y + " = " + myApp.doOperation(x, y, '/')
        );

    }
    private int readNum(String word){
        System.out.print("What is the " + word + " number? ");
        return Integer.parseInt(inp.nextLine());
    }
    private int doOperation(int x, int y, char op){
        switch (op)
        {
            case '+':
                return x + y;
            case '-':
                return x - y;
            case '*':
                return x * y;
            case '/':
                return x / y;
        }
        return 0;
    }
}
