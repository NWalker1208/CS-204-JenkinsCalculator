import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] argv) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.print("> ");
            String cmdline = scanner.nextLine().toLowerCase();
            String[] words = cmdline.split(" ");
            String cmd = words[0];
            if (cmd.equals("quit")) {
                break;
            }

            List<Integer> args = new ArrayList<>();
            for (int i = 1; i < words.length; i++) {
                args.add(Integer.parseInt(words[i]));
            }

            Object result;
            switch (cmd) {
                case "add":
                    result = calculator.add(args.get(0), args.get(1));
                    break;
                case "subtract":
                    result = calculator.subtract(args.get(0), args.get(1));
                    break;
                case "multiply":
                    result = calculator.multiply(args.get(0), args.get(1));
                    break;
                case "divide":
                    result = calculator.divide(args.get(0), args.get(1));
                    break;
                case "fibonacci":
                    result = calculator.fibonacciNumberFinder(args.get(0));
                    break;
                case "binary":
                    result = calculator.intToBinaryNumber(args.get(0));
                    break;
                default:
                    System.out.println("Invalid command");
                    continue;
            }

            System.out.printf("Result: %s\n", result);
        }
    }
}
