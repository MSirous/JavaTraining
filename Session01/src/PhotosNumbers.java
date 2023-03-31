import java.util.Scanner;

public class PhotosNumbers {
    public static void main(String[] args) {

        System.out.println("Please Enter number:");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
//        PictureNumbers10(number);
        PictureNumbers02(number);
    }

    public static void PictureNumbers01(int n)
    {
        int i , j;
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print(1);
            }
            System.out.println();
            
        }
    }

    public static void PictureNumbers02(int n)
    {
        int x=1;
        for (int i = 0; i <= n; i++) {
            System.out.println(x);
            x *= 10;

        }
    }
    public static void PictureOneAndStar(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 6; j++) {
                if (i > 0 && i < n-1 && j < 5 && j > 0){
                        System.out.print('*');
                }
                    else
                        System.out.print(1);
            }
            System.out.println();
        }
    }
}
