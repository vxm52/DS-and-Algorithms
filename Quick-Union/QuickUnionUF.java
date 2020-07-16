public class QuickUnionUF
{
    private int[] id;

    public QuickUnionUF(int N) //Constructor
    {
        id = new int[N]; //Create the id array
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
            i = id[i]; //Chase parent pointers until reach root. Untill i = id[i]
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
    }
}

