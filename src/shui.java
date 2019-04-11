
import java.util.Scanner;

public class shui {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int[] n1 = new int[n];
        int[] n2 = new int[n];
        for(int i = 0; i < n; i++){
            n1[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            n2[i] = sc.nextInt();
        }
        w = w/3;
        double f = w *3.00;
        System.out.println(String.format("%.6f",f));
    }
}
