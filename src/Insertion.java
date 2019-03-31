/**
 * Created by valar on 2019/3/30.
 */
public class Insertion {
    public static void main(String[] args) {
        Comparable[] a = {2,1,45,67,8,4,8,5,};
        sort(a);
        show(a);
    }

    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 &&less(a[j],a[j-1]); j--) {
                exch(a,j,j-1);
            }
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void show(Comparable[] a) {
        for (Comparable e : a) {
            System.out.println(e);
        }
    }

    public static boolean isSorded(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i - 1]))
                return false;
        }
        return true;
    }
}
