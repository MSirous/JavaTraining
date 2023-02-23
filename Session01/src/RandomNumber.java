public class RandomNumber {
    public static void main(String[] args) {
        int[] arr = new int[100];
        GenerateRandom(arr);
        int zero = CountZeroes(arr);
        System.out.println(zero);
    }

    public static void GenerateRandom(int[] n) {
        for (int i =0; i < n.length; i++) {
            double r = Math.random();
            int a = (int) (4 * r);
            // making two digits
            n[i] = a + 10;
        }
    }

    public static int CountZeroes(int[] n){
        int x = 0;
        for (int i =0; i < n.length; i++)
        {
            // View array elements. ** But this is not a true way.
//            System.out.println(n[i]);
            if (n[i] % 10 == 0)
                x++;
        }
        return x;

    }
}