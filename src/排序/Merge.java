package 排序;

/**
 * Created by valar on 2019/3/30.
 */
public class Merge {
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
        sort(a,0,a.length-1);
    }
    public static void sort(Comparable[] a,int lo,int hi) {
      if(hi <= lo)
          return;
      int mid = lo + (hi - lo)/2;
      sort(a,lo,mid);
      sort(a,mid+1,hi);
      merge(a,lo,mid,hi);
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
