import java.util.Scanner;

/**
 * Created by valar on 2019/4/11.
 */
public class sortString {
    static String sortString(String str) {
        char[] a = new char[str.length()];
        for (int i = 0;i < a.length;i++){
            a[i] = str.charAt(i);
        }
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 &&less(a[j],a[j-1]); j--) {
                exch(a,j,j-1);
            }
        }
        String s = "";
        for (int i = 0;i < a.length;i++){
            s += a[i];
        }
        return s;
    }

    private static boolean less(char v, char w) {
        return v> w;
    }

    private static void exch(char[] a, int i, int j) {
        char t = a[i];
        a[i] = a[j];
        a[j] = t;
    }


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;

        String _str;
        try {
            _str = in.nextLine();
        } catch (Exception e) {
            _str = null;
        }

        res = sortString(_str);
        System.out.println(res);
    }
}
