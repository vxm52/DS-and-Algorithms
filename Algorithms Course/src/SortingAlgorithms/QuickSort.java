
package SortingAlgorithms;

/**
 *
 * @author Vaibhav
 */

public class QuickSort {
    
    private static int partition(Comparable[] a, int lo, int hi)
    {
        int i = lo, j = hi+1;
        while (true)
        {
            while (less(a[i++], a[lo]))     // Find item on left to swap
            {
                if (i == hi)
                {
                    break;
                }
            }
            while (less(a[lo], a[j--]))     // Find item on right to swap
            {
                if (j == lo)
                {
                    break;
                }
            }
            
            if (i >= j)             // Check if pointers cross
            {
                break;
            }
            
            exch(a, i , j);         // Swap
        }
        
        exch(a, lo, j);             // Swap with partitioning item
        return j;                   // Return index of item now known to be in place
    }
    
    
    public static void sort (Comparable[] a)     // Shuffle needed for performance guarantee
    {
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }
    
    private static void sort(Comparable[] a, int lo, int hi)
    {
        //Use Insertion sort if the data set or array is very small
        //Insertion sort is more efficient than quicksort for small arrays.
//        if (hi <= lo + CUTOFF - 1)
//        {
//            Insertion.sort(a, lo, hi);
//            return;
//        }
        if (hi <= lo)
        {
            return;
        }
        int j = partition(a, lo, hi);      // Quick sort is a recursive program using the partition method
        sort(a, lo, j-1);
        sort(a, j+1, hi);
    }
            
    private static boolean less(Comparable v, Comparable w)
    {
        return v.compareTo(w) < 0;
    }
    
    private static void exch(Comparable[] a, int i ,int j)
    {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }
}
