
package SortingAlgorithms;

/**
 *
 * @author Vaibhav
 */
public class MergeSort {
    
    private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi)
    {
        lo = 0;
        hi = a.length -1;
        
        for (int k = lo; k <= hi; k++)          //Copy all elements to auxiliary array
        {
            aux[k] = a[k];
        }
        
        int i = lo, j = mid+1;
        for (int k = lo; k <= hi; k++)          //Merge
        {
            if (i > mid) {                      //If left-half of aux array is finished, then move over the j element 
                a[k] = aux[j++];
            }
            else if (j > hi)                    //If right-half of aux array is finished then move over the i element
            {
                a[k] = aux[i++];
            }
            else if (less(aux[j], aux[i]))     //Check if element at index j is smaller than element at index i
            {
                a[k] = aux[j++];               //Copy index j element to our sorted array at current index (k)
            }
            else                               //Else copy index i element to our sorted array at current index (k)
            {
                a[k] = aux[i++];
            }
        }        
    }
    
    
    private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi)
    {
        //Use Insertion sort if the data set or array is very small
        //Insertion sort is more efficient than mergesort for small arrays.
//        if (hi <= lo + CUTOFF - 1)
//        {
//            Insertion.sort(a, lo, hi);
//            return;
//        }
        if (hi <= lo)
        {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(a, aux, lo, mid);
        sort(a, aux, mid+1, hi);
        if (!less(a[mid+1], a[mid]))  //If the arrray is already sorted, then just stop. This makes the entire mergesort algorithm more efficient
        {
            return;
        }
        merge(a, aux, lo, mid, hi);
    }
    
//    public static void sort(Comparable[] a)
//    {
//        Comparable[] aux = new Comparable[a.length];
//        sort(a, aux, 0, a.length - 1);
//    }
    
    private static boolean less(Comparable v, Comparable w)
    {
        return v.compareTo(w) < 0;
    }
}
