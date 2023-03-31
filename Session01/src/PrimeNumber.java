import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter Number: ");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(PrimeDigits(number));

    }
    public static boolean PrimeDigits(int n){
    int i, m=0, flag=0;
//    int n=3;//it is the number to be checked
    m = n/2;
  if(n==0||n==1){
        return false;
    }else{
        for(i=2;i<=m;i++){
            if(n%i==0){
                flag=1;
                break;
            }
        }
        if(flag==0)  {
            return true;
        }
    }//end of else
        return false;
    }
}
