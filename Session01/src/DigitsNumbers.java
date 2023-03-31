import java.util.Scanner;

public class DigitsNumbers {
    public static void main(String[] args) {
        System.out.println("Please Enter number:");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        DigitsNumber(number);
    }

    public static void DigitsNumber(int n)
    {
        int count = 0;

        while (n != 0) {
            // num = num/10
            n /= 10;
            ++count;
        }

        System.out.println("Number of digits: " + count);
    }
    }


