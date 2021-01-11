import java.util.Scanner;
import java.io.*;

public class Divisor {
    static int x = 0, y = 0, answer = 0, valueEnterType;

    public static void main(String[] args) {

        String filePath = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Enter the method X and Y values enter..\n\t1 Enter value using terminal.\n\t2 enter value using Class.\n\tpress any key to exit");
        // type - commond prompt or file load
        valueEnterType = scanner.nextInt();

        switch (valueEnterType) {
            case 1:
                // inputs from command prompt
                System.out.println("enter x value:");
                x = scanner.nextInt();
                System.out.println("Enter y value:");
                y = scanner.nextInt();
                xDivByY(x, y);
                break;
            case 2:
                // inputs from file
                System.out.println("enter the file path:");
                scanner.nextLine();
                filePath = scanner.nextLine();
                loadDataFromFile(filePath);
                break;
            default:
                break;
        }
        scanner.close();

    }

    // load data from file
    private static void loadDataFromFile(String path) {
        try {

            FileInputStream file = new FileInputStream(path);
            Scanner inputFile = new Scanner(file);
            x = Integer.parseInt(inputFile.nextLine());
            y = Integer.parseInt(inputFile.nextLine());
            inputFile.close();
            xDivByY(x, y);

        } catch (FileNotFoundException e) {
            // file not available for lad data
            System.out.println("file not exist");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            // file data cannot convert to int
            System.out.println("values are not number");
            e.printStackTrace();
        }
    }

    // divide calculation
    private static void xDivByY(int x, int y) {
        try {
            answer = x / y;
            System.out.println(x + " / " + y + " = " + answer);
        } catch (ArithmeticException e) {
            System.out.println("Arithmatic Exception occour");
            e.printStackTrace();
        }
    }
}
