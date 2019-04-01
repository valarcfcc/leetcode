package 排序;

/**
 * Created by valar on 2019/3/30.
 */
public class Quick {
    public static void main(String[] args) {
        Comparable[] a = {2,1,45,67,8,4,8,5,};
        sort(a,0,a.length-1);
        show(a);
    }
    public static int partition(Comparable[] a,int lo,int hi){
        int i = lo,j = hi +1;
        Comparable v = a[lo];
        while (true){
            while (less(a[++i],v))
                if (i == hi) break;
            while (less(v,a[--j]))
                if (j == lo) break;
            if(i >= j) break;
            exch(a,i,j);

        }
        exch(a,lo,j);
        return j;
    }
    public static void sort(Comparable[] a,int lo,int hi) {
        if(hi <= lo)
        return;
        int j = partition(a,lo,hi);
        sort(a,lo,j-1);
        sort(a,j+1,hi);
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
