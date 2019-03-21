/**
 * Created by valar on 2019/3/19.
 */


import java.lang.reflect.Array;
import java.util.*;

public class solu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum =0;
        List<Integer> nums = new ArrayList<>();
        int i = 0;
        while (in.hasNextInt()) {//注意while处理多个case
            nums.add(in.nextInt());
            if (i == n)
                break;
        }
        for (int a:nums) {
            sum += a;
        }
        Collections.sort(nums);

        int s = 0;
        if(sum%2!=0)
        {
            return ;
        }
        for (int a:nums) {
            if (s == sum/2.0)
            sum += a;
        }

    }
}