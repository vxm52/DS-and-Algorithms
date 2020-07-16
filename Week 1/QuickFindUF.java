
public class QuickFindUF
{
    private int[] id;

    public QuickFindUF(int N) //Constructor
    {
        // Set id of each object to itself (N array accesses)
        id = new int[N]; //Create id array of size N
        for (int i = 0; i < N; i++)
        {
            id[i] = i;
        }
    }

    public boolean connected(int p, int q)
    {
        // Check whether p and q are in the same component (2 array accesses)
        return id[p] == id[q];
    }

    public void union(int p, int q)
    {
        // Change all entries with id[p] to id[q] (at most 2N + 2 array accesses)
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++)
        {
            if (id[i] == pid) id[i] = qid;
        }
    }
}