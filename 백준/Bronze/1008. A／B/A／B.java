import java.util.*;

class Main{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        double result = (double)A / B;

        System.out.println(result);

        scanner.close();
    }
}