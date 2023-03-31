import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        EvenNumber(number);


    }

    public static void EvenNumber(int n)
    {
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0)
            {
                System.out.println(i);
            }

        }
    }
}
