package calci;
import java.util.*;

public class basic1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean calculate = true;

        while (calculate) {
            System.out.println("_____WELCOME _____");
            System.out.println("_____CALCULATOR _____");
            System.out.println("ENTER THE OPERATION YOU WANT TO PERFORM:");
            System.out.println("1: Addition (+)");
            System.out.println("2: Subtraction (-)");
            System.out.println("3: Multiplication (*)");
            System.out.println("4: Division (/)");
            System.out.println("5: Exit");

            int operation = sc.nextInt();

            if (operation >= 1 && operation <= 4) {
                System.out.println("ENTER NUM 1:");
                int num1 = sc.nextInt();
                System.out.println("ENTER NUM 2:");
                int num2 = sc.nextInt();

                int result = 0;
                switch (operation) {
                    case 1:
                        result = num1 + num2;
                        break;
                    case 2:
                        result = num1 - num2;
                        break;
                    case 3:
                        result = num1 * num2;
                        break;
                    case 4:
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            System.out.println("Cannot divide by zero!");
                            break;
                        }
                        break;
                }
                System.out.println("RESULT: " + result);
            } else if (operation == 5) {
                calculate = false;
                System.out.println("Exiting the Calculator. Thank you!");
            } else {
                System.out.println("Invalid operation! Please enter a valid option.");
            }
        }
        sc.close();
    }
}
