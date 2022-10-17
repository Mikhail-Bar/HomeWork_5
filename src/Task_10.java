import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length num line: ");
        int n  = sc.nextInt();
        float result = 0;
        for (int i = 0; i <= n; i++){
            if (i == 0){
                System.out.print("1 + ");
                result = 1;
            } else if ( i == n) {
                result = result + (float) 1/n;
                System.out.printf(" 1/%d = %.2f ", n , result);
            }else { result = result + (float) 1/i;
                    System.out.printf("1/%d +", i);}

        }
    }
}
