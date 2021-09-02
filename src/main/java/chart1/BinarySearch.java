package chart1;

public class BinarySearch {

    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static int rankOnRecursion(int key, int[] a) {
        return rankOnRecursion(key, a, 0, a.length - 1);
    }

    private static int rankOnRecursion(int key, int[] a, int lo, int hi) {
        //如果key存在于a[]中， 它的索引不会小于lo且不会大于hi
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) return rankOnRecursion(key, a, lo, mid - 1);
        else if (key > a[mid]) return rankOnRecursion(key, a, mid + 1, hi);
        else return mid;
    }
}
