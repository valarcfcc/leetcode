package 排序;

/**
 * Created by valar on 2019/3/30.
 */
public class MergeBU {
    public static void main(String[] args) {
        Comparable[] a = {2,1,45,67,8,4,8,5,};
        sort(a);
        show(a);
    }
    private static Comparable[] aux;
    public static void merge(Comparable[] a,int lo,int mid,int hi){
        int i = lo,j = mid +1;
        for (int k = lo; k <= hi; k++) {
            aux[k] = a[k];
        }
        for(int k =lo; k <= hi;k++){
            if (i > mid)
                a[k] = aux[j++];
            else if(j > hi)
                a[k] = aux[i++];
            else if(less(aux[j],aux[i]))
                a[k] = aux[j++];
            else a[k] = aux[i++];
        }
    }
    public static void sort(Comparable[] a) {
        aux = new Comparable[a.length];
        int N = a.length;
        for (int sz = 1;sz < N;sz = sz + sz)
            for (int lo = 0; lo < N-sz;lo += sz + sz)
                merge(a,lo,lo + sz -1,Math.min(lo + sz + sz -1,N - 1));
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
