import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(SumDigits(number));

    }

    public static int SumDigits(int number)
    {
        int sum = 0;
        while (number != 0){
            sum = sum + number % 10;
            number = number/10;
        }
        return sum;
    }
}
