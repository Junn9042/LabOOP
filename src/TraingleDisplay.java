import java.util.Scanner;

public class TraingleDisplay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= n; j++){
                if (i + j >= n) System.out.print("*");
                else System.out.print(" ");
            }
            for(int j = n+1; j < 2*n; j++){
                if (j - i <= n) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
