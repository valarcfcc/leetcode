import java.util.Scanner;//
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = in.nextInt();
        int[] nums = new int[n];
        int i = 0;
        while (in.hasNextInt()) {//注意while处理多个case
            nums[i++] = in.nextInt();
           if (i == n)
               break;
        }

        boolean isSum = true;
        for ( i =0 ;i<n-2;i++){
            for (int j =i+1;j <n-1;j++){
                for (int k = j+1; k < n; k++) {
                    if( (sum == (nums[i] + nums[j] + nums[k])) && isSum)
                    {
                        System.out.println(i + " " + j + " " + k);
                        isSum = false;
                    }
                }
            }
        }
        if ( isSum)
            System.out.println(-1 + " " + -1 + " " + -1);
    }
}