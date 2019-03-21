import java.util.Scanner;

/**
 * Created by valar on 2019/3/6.
 */
public class doinb{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            System.out.println(count(n));
        }
    }
    public static long count(int n){
        if(n<=0)
            return 0;
        long [] dp = new long[n +1];
        dp [0] = 1;
        int [] coins = new int[]{1,5,10,20,100};
        for (int i:coins){
            for (int j = i;j<=n;j++){
                dp[j] += dp[j -i];
            }
        }
        return dp[n];
    }
}
