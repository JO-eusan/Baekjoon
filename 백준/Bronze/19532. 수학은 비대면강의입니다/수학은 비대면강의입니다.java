import java.util.*;

class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();

        loop: for(int x=-999; x <= 999; x++)
        {
            for(int y=-999; y <= 999; y++)
            {
                if(a*x + b*y == c && d*x + e*y == f)
                {
                    System.out.printf("%d %d", x, y);
                    break loop;
                }
            }
        }
        
        scanner.close();
    }
    
}