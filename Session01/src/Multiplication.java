public class Multiplication {
    public static void main(String[] args) {
        int[][] math = new int[10][10];
        for (int i = 0; i < math.length ; i++)
            for (int j = 0; j < math[i].length; j++)
                math[i][j] = (i+1)*(j+1);

        for (int i = 0; i < math.length ; i++) {
            for (int j = 0; j < math[i].length; j++) {
                System.out.print(math[i][j] + "\t");
            }
            System.out.println();

        }
    }
}
