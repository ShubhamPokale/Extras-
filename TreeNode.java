public class TreeNode {

    private int data;
    private TreeNode left;
    private TreeNode right;
    // default consturctor
    public TreeNode()
        {
            data = 0 ;
            left = null;
            right = null;
        }
    // parametriezed constructor
    public TreeNode(int data)
    {
        this.data = data ;
        left = null;
        right = null;
    }

    // setter
    public void setData(int data)
        {
            this.data = data;
        }

    public void setLeft(TreeNode left)
        {
            this.left = left;
        }
    public void setRight(TreeNode right)
    {
        this.right = right;
    }
    // getter
    public int getData()
        {
            return data;
        }
    public TreeNode getLeft()
        {
            return left;
        }

    public TreeNode getRight()
        {
            return right;
        }






}
