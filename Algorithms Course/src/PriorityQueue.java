
/**
 *
 * @author Vaibhav
 */

// ***** Complete Java implementation of Priority Queue using the Binary Heap data structure   *****  //

public class PriorityQueue {
    
    public class MaxPQ<Key extends Comparable<Key>>
    {
        private Key[] pq;
        private int N;
        
        
        
        //Priority Queue operations:
        
        public MaxPQ(int capacity)                     // Creates an empty priority queue
        {
            pq = (Key[]) new Comparable[capacity + 1];
        }
        
        public boolean isEmpty()                       // Is the priorityqueue empty?
        {
            return N == 0;
        }
        
        public void insert(Key key)                    // Insert a key into the priority queue
        {
            
        }
        
        public Key delMax()                            // Return and remove the largest key
        {
            Key max = pq[1];
            exch(1, N--);
            sink(1);
            pq[N+1] = null;
            return max;
        }
        // End of Priority Queue operations //  
        
        
        
        //Heap helper functions:
        
        private void swim(int k)
        {
            
        }
        
        private void sink(int k)
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
                exch(k, j);
                k = j;
            }
        }
        // End of Heap helper functions //
        
        
      
        //Array helper functions:
        
        private boolean less(int i, int j)
        {
            return pq[i].compareTo(pq[j]) < 0;
        }
        
        private void exch(int i, int j)
        {
            Key t = pq[i];
            pq[i] = pq[j]; 
            pq[j] = t;
        }
        // End of Array helper functions //
    }
}
