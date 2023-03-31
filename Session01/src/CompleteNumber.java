import java.util.Scanner;

public class CompleteNumber {
    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(CompleteNumbers(number));
    }

    public static boolean CompleteNumbers(long number)
    {
        long sum=0;
        int i=1;
        //executes until the condition becomes false
        while(i <= number/2)
        {
            if(number % i == 0)
            {
        //calculates the sum of factors
                sum = sum + i;
            } //end of if
        //after each iteration, increments the value of variable i by 1
            i++;
        } //end of while
        //compares sum with the number
        if(sum == number)
        {
        //prints if sum and n are equal
            return true;
        } //end of if
        else
        //prints if sum and n are not equal
            return false;
    }

}
