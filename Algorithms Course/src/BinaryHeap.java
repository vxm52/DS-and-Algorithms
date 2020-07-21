/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vaibhav
 */
public class BinaryHeap {
    
// *****    Promotion in a heap. When a child's key becomes larger key than its parent's key. 
//          Use swim method to exchange key in child with key in parent. Repeat until heap order restored.
//    private void swim(int k)
//    {
//        while (k < 1 && less(k/2, k))
//        {
//            exch(k, k/2);
//            k = k/2;
//        }
//    }
    
    
    
// *****    Insertion in a heap. Add node at end, then swim it up.   
//    public void insert(Key x)
//    {
//        pq[N++] = x;
//        swim(N):
//    }
    
    
// *****     Demotion in a heap. Parent's key becomes smaller than one (or both) of its children's.
//           Exchange key in parent with key in larger child. Repeat until heap order restored.

//    private void sink(int k)
//    {
//        while (2*k <= N)
//        {
//            int j = 2*k;
//            if (j < N && less(j, j+1))
//            {
//                j++;
//            }
//            if (!less(k, j))
//            {
//                break;
//            }
//            exch(k, j);
//            k = j;
//        }
//    }
    
    
// *****     Delete the maximum in a heap. Exchange root with node at end, then sink it down.
//    public key delMax()
//    {
//        Key max = pq[1];
//        exch(1, N--);
//        sink(1);
//        pq[N+1] = null;
//        return max;
//    }
}
