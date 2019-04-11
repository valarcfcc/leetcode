import java.util.Scanner;

/**
 * Created by valar on 2019/4/11.
 */
public class binarySearch {
    public static int binarySearch(int[] nums,int target){
        int lo = 0,hi = nums.length-1;
        int mid = (lo + hi)/2;
        while (lo <= hi){
            if (target == nums[mid])
                return mid;
            else if (target > nums[mid]){
                lo = mid+1;
                mid = (lo + hi)/2;
            }
            else {
                hi = mid - 1;
                mid = (lo + hi)/2;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int _nums_size = 0;
        _nums_size = Integer.parseInt(in.nextLine().trim());
        int[] _nums = new int[_nums_size];
        int _nums_item;
        for(int _nums_i = 0; _nums_i < _nums_size; _nums_i++) {
            _nums_item = Integer.parseInt(in.nextLine().trim());
            _nums[_nums_i] = _nums_item;
        }

        int _target;
        _target = Integer.parseInt(in.nextLine().trim());

        res = binarySearch(_nums, _target);
        System.out.println(String.valueOf(res));

    }
}
