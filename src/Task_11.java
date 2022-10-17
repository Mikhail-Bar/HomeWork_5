import java.util.Scanner;

public class Task_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length num line: ");
        int n  = sc.nextInt();
        int result = 0;
        for (int i = 0; i <= n; i++){
            if (i == 0){
                System.out.printf("%d² + " ,n);
                result = n * n;
            } else if ( i == n) {
                result = result + (2 * n) * (2 * n);
                System.out.printf(" (2 * %d)² = %d ", n , result);
            }else { result = result + (n + i) * (n + i);
                System.out.printf("(%d + %d)² + ",n , i);}

        }
    }
}
