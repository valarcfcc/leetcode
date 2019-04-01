package 数组;

/**
 * Created by valar on 2019/1/1.
 */
public class Solution {
    public static void main(String[] args) {
        int[] a = {2,1,45,67,8,4,8,5,};

        rotate(a,3);
        show(a);
    }
    public static void rotate(int[] nums,int k){
        for (int i = 0;i < k; i++){
            int temp = nums[nums.length-1];
            for(int j =nums.length-1;j >0;j-- ){
                nums[j] = nums[j-1];
            }
            nums[0] = temp;

        }
    }

    private static void show(int[] a) {
        for (Comparable e : a) {
            System.out.print(e);
        }
    }
}
