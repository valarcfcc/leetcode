/**
 * Created by valar on 2019/3/6.
 */
public class ArraySort implements Runnable{
    private String num;
    public ArraySort(int num){
        this.num = num + "";
    }
    public static void main(String[] args) {
       int[] nums = {11,3,889,3245,2,234,545,1};
        for (int i = 0; i < nums.length; i++) {
            new Thread(new ArraySort(nums[i])).start();
        }
    }

    @Override
    public void run() {
        try{
            Thread.sleep(Integer.parseInt(num));
            System.out.print(num +" ");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
