import java.util.Scanner;

public class Task_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length num line: ");
        int n  = sc.nextInt();
        int result = 0, f1 = 1, f2 = 1;
        for (int i = 3; i <= n; i++){
            if (i == 3){
                System.out.printf("%d , %d" , f1, f2 );
            }else { result = f1 + f2;
                f1 = f2;
                f2 = result;
                System.out.printf(" , %d", result);}

        }
    }
}
