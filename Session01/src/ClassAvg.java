public class ClassAvg {
    public static void main(String[] args) {
        double[][] matrix = new double[10][];
        for (int i = 0; i < matrix.length; i++) {
            double[] avgs = generateClassAverages();
            matrix[i] = avgs;
            System.out.println();
        }

        // Question number 01:
        int studensCount = question01(matrix);
        System.out.println("Number of Students: " + studensCount);

        // Question number 02:
        double studensAvg = question02(matrix);
        System.out.println("highest grade point average: " + String.format("%.1f", studensAvg ));

        // Question number 03:
        double minClass = question03(matrix);
        System.out.println("The lowest GPA in which class : " + String.format("%.0f", minClass ));
    }

    public static int question01(double[][] matrix)
    {
//        System.out.println("Number of Students: ");
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            count += matrix[i].length;
        }
        return count;
    /*
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                count++;
            }
        }
*/ }
    public static double question02(double[][] matrix){
        double maxAvg = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxAvg)
                    maxAvg = matrix[i][j];
            }
        }
        return maxAvg;
    }

    public static double question03(double[][] matrix){
        double minAvg = 99;
        int minClass = -1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < minAvg) {
                    minAvg = matrix[i][j];
                    minClass = i ;
                }
            }
        }
        return minClass;
    }

    public static double[] generateClassAverages(){
        double random = Math.random();
        int b = (int)(random * 10 + 15);       // b is between 15 - 25
        double[] avgs = new double[b];
        for (int i = 0; i < avgs.length; i++) {
             random = Math.random();
            double avg  = random * 10 + 10;
            avgs[i] = avg;
            System.out.print(String.format("%.1f", avg )+ "\t");
        }
        return avgs;


    }


}
