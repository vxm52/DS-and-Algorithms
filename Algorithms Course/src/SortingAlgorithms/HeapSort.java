
package SortingAlgorithms;

/**
 *
 * @author Vaibhav
 */
public class HeapSort {
    
    public static void sort(Comparable[] pq)
    {
        int N = pq.length;
        for(int k = N/2; k >= 1; k--)
        {
            sink(pq, k, N);
        }
        
        while (N > 1)
        {
            exch(pq, 1, N);
            sink(pq, 1, N--);
        }
    }
    
    private static void sink(Comparable[] pq, int k, int N)
        {
            while (2*k <= N)
            {
                int j = 2*k;
                if (j < N && less(j, j+1))
                {
                    j++;
                }
                if (!less(k, j))
                {
                    break;
                }
                exch(pq, k, j);
                k = j;
            }
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
