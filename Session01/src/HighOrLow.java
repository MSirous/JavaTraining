import java.util.Scanner;

public class HighOrLow {
    public static void main(String[] args) {
        System.out.println("Please Enter number:");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        HighOrLowWithTernary(number);

    }

    public static void HighOrLow(int n)
    {
        if (n >= 1000 )
        {
            System.out.println(n + " number is High.");
        }
        else {
            System.out.println(n + " number is Low.");
        }
    }

    public static void HighOrLowWithTernary(int n)
    {
        String result = (n >= 1000) ?  "number is High." : "number is Low.";
        System.out.println(result);
    }


}
