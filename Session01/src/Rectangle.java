import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the width of the rectangle: ");
        double width = in.nextDouble();
        System.out.println("Enter the length of the rectangle: ");
        double length = in.nextDouble();
        rectangleArea(length, width);
        rectangleEnvironment(length, width);

    }

    public static void rectangleArea(double l, double w) {
        double area = l * w;
        System.out.println("Area: " + area);
    }

    public static void rectangleEnvironment(double l, double w) {
        double environment = 2 * (l + w);
        System.out.println("Environment: " + environment);
    }
}
