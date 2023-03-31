import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        System.out.println("Please Enter number:");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        AbsoluteValue(number);

    }

    public static void AbsoluteValue(int number){
        if (number < 0)
        {
            System.out.println(-number);
        }else {

            System.out.println(number);
        }
    }
}
