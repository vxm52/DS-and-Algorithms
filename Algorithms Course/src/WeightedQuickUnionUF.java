public class WeightedQuickUnionUF //16 bytes (object overhead)
{
    private int[] id;     // 8 + (4N + 24)
    private int[] size;   // 8 + (4N + 24)
    private int count;    // 4 bytes (int)
                          // 4 bytes (padding)     // Total: 8N + 88   ~8N bytes
    public WeightedQuickUnionUF(int N) //Constructor
    {
        id = new int[N]; //Create the id array
        size = new int[N];
        for (int i = 0; i < N; i++)
        {
            id[i] = i; //Set id of each object to itself (N array accesses). 
                       //In other words, we set each element to be its own root
        } 
    }

    private int root(int i) //Private method that implements the process of finding the root
    {
        while (i != id[i])
        {
            id[i] = id[id[i]];    //Add second loop to root() to set the idp[ of each examined node to the root.
            i = id[i];            //Chase parent pointers until reach root. Untill i = id[i]
        }
        return i;
    }

    public boolean connected(int p, int q) //Connected operation
    {
        return root(p) == root(q); //Finds the root of p and q and checks if they are equal
    }

    public void union(int p, int q) //Union operation
    {
        int i = root(p); //Find root of first element
        int j = root(q); //Find root of second element
        id[i] = j;       //Set the id of the first to be the second one
        if (i == j)
        {
            return;
        }
        if (size[i] < size[j])
        {
            id[i] = j;
            size[j] += size[i];
        }
        else
        {
            id[j] = i;
            size[i] += size[j];
        }
    }
}

