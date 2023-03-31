public class RemainderDividedNumbers {

    public static void main(String[] args) {
        int num = 1000, count = 1;
        while (count <= num)
        {
            count++;
            if (count % 3 ==1)
            {
                System.out.println(count);
            }

        }


    }
}
