



/**
 *
 * @author Vaibhav
 * @param <Key>
 * @param <Value>
 */
public class BST<Key extends Comparable<Key>, Value>
{    
    private Node root;

    private int size(Node left) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Node min(Node right) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private class Node
    {
        private Key key;
        private Value val;
        private Node left, right;
        private int count;
        
        public Node(Key key, Value val)
        {
            this.key = key;
            this.val = val;
        }
    }
    
    public void put(Key key, Value val)              // BST Insert
    {
        root = put(root, key, val);
    }
    
    private Node put(Node x, Key key, Value val)     // Recursive code 
    {
        if (x == null)
        {
            return new Node(key, val);
        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0)
        {
            x.left = put(x.left, key, val);
        }
        else if (cmp > 0)
        {
            x.right = put(x.right, key, val);
        }
        else
        {
            x.val = val;
        }
        return x;
    }
    
    public Value get(Key key)                        // BST Search
    {
        Node x = root;
        while(x != null)
        {
            int cmp = key.compareTo(x.key);
            if (cmp < 0)
            {
                x = x.left;
            }
            else if (cmp > 0)
            {
                x = x.right;
            }
            else
            {
                return x.val;
            }
        }
        return null;
    }
    
    public void deleteMin()
    {
        root = deleteMin(root);
    }
    
    private Node deleteMin(Node x)
    {
        if (x.left == null)
        {
            return x.right;
        }
        x.left = deleteMin(x.left);
        x.count = 1 + size(x.left) + size(x.right);
        return x;
    }
    
    //Hibbard deletion: Java implementation
    public void delete(Key key)                      // BST Delete
    {
        root = delete(root, key);
    }
    
    private Node delete(Node x, Key key)
    {
        if (x == null)
        {
            return null;
        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0)
        {
            x.left = delete(x.left, key);
        }
        else if (cmp > 0)
        {
            x.right = delete(x.right, key);
        }
        else
        {
            if (x.right == null)
            {
                return x.left;
            }
            if (x.left == null)
            {
                return x.right;
            }
            
            Node t = x;
            x = min(t.right);
            x.right = deleteMin(t.right);
            x.left = t.left;
        }
        x.count = size(x.left) + size(x.right) + 1;
        return x;
    }
    
    public Iterable<Key> iterator()
    {
        return null;
        
    }
    
}
