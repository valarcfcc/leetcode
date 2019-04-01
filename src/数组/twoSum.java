package 数组;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by valar on 2019/1/1.
 */
public class twoSum {
    public static void main(String[] args) {
        int[] a = {2,1,45,67,8,4,8,5,};


        show(twosum(a,3));
    }
    public static int[] twosum(int[] nums,int target) {
        int [] n = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                n[0] = map.get(temp);
                n[1] = i;
            }
            map.put(nums[i], i);
        }
        return n;
    }

    private static void show(int[] a) {
        for (Comparable e : a) {
            System.out.print(e + " ");
        }
    }
}
