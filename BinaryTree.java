// Given a Binary tree Print its nodes in level order traversal

import com.sun.source.tree.Tree;

import java.util.LinkedList;
import java.util.*;

public class BinaryTree {

    private TreeNode root; // Root is a refernce variable;

    //getter
    public TreeNode getRoot()
        {
            return root;
        }

    // setter
    public void setRoot(TreeNode root)
        {
        this.root = root ;
        }

    // createNode
    public TreeNode createNode(int d )
        {
            if(root == null)
                {
                    root = new TreeNode(d);
                    return root;
                }
            TreeNode new_node = new TreeNode(d);
            return new_node;
        }
    // Level Order Traversal

    public void printLevelOrder()
        {
            // 1 Create an empty Queue
            Queue<TreeNode> queue = new LinkedList<TreeNode>();
            // 2 push the root into the queue
            queue.add(root);

            // 3 loop while the queue is not empty
            while(!queue.isEmpty())
                {
                    TreeNode currNode = queue.poll();
                    System.out.print(currNode.getData() + " ");

                    // Enqueue left child
                    if(currNode.getLeft() !=null)
                        {
                            queue.add(currNode.getLeft());
                        }

                    // Enqueue right child
                    if(currNode.getRight() !=null)
                        {
                            queue.add(currNode.getRight());
                        }
                }

        }

    // In order traversal  We first traverse the left sub tree, then print the root node and then traverse the right sub tree
    public void InOrder(TreeNode root)       // L D R
        {   if(root !=null)
            {
                InOrder(root.getLeft());
                System.out.print(root.getData() + " ");
                InOrder(root.getRight());
            }


        }

    public void PreOrder(TreeNode root) // D L R // 10 20 40 50 30 60 70
        {
            // base case
            if(root != null)
                {
                    System.out.print(root.getData() + " ");
                    PreOrder(root.getLeft());
                    PreOrder(root.getRight());


                }
        }

    public void PostOrder(TreeNode root)    // L R D // 40 50 20 60 70 30 10
        {
            //base condition
            if( root != null)
                {
                    PostOrder(root.getLeft());
                    PostOrder(root.getRight());
                    System.out.print(root.getData() + " ");

                }
        }

    public int sumOfNonLeafNodes()
    {int sum = 0;
        // 1 Create an empty Queue
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        // 2 push the root into the queue
        queue.add(root);

        // 3 loop while the queue is not empty
        while(!queue.isEmpty())
        {
            TreeNode currNode = queue.poll();
            // Logic for getting sum of Non leaf Nodes
            if(currNode.getLeft() != null || currNode.getRight() != null)
                {
                        sum = sum + currNode.getData();
                }
            //  System.out.print(currNode.getData() + " ");

            // Enqueue left child
            if(currNode.getLeft() !=null)
            {
                queue.add(currNode.getLeft());
            }

            // Enqueue right child
            if(currNode.getRight() !=null)
            {
                queue.add(currNode.getRight());
            }
        }

        return sum;

    }

    public int sumOfLeafNodes()
    {int sum = 0;
        // 1 Create an empty Queue
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        // 2 push the root into the queue
        queue.add(root);

        // 3 loop while the queue is not empty
        while(!queue.isEmpty())
        {
            TreeNode currNode = queue.poll();
            // Logic for getting sum of leaf Nodes
            if(currNode.getLeft() == null && currNode.getRight() == null)
            {
                sum = sum + currNode.getData();
            }
            //  System.out.print(currNode.getData() + " ");

            // Enqueue left child
            if(currNode.getLeft() !=null)
            {
                queue.add(currNode.getLeft());
            }

            // Enqueue right child
            if(currNode.getRight() !=null)
            {
                queue.add(currNode.getRight());
            }
        }

        return sum;

    }

    // minimum value of all the nodes

    // maximum value of all the nodes

    // insert level wise
    public void insert_levelwise(int data)
        {
            TreeNode new_node = new TreeNode(data); // create a node that is to be added
            // take a iterator to traverse the tree that we are making
            //what if I want to add a node in an already existing tree !
            Queue <TreeNode> q = new LinkedList<TreeNode>();
            // this queue will store our Tree Nodes as we traverse it level wise
            TreeNode iter;

            if(root == null)
                {
                    root = new_node;
                    return;
                }

            q.add(root);

            while(!q.isEmpty())
                {
                    iter = q.remove();
                    if(iter.getLeft() == null)      // Check if the left of the current node is null or what, if it is null go ahead and set left of current with the new node else, if there exists an element already, then add it to the queue;
                        {
                            iter.setLeft(new_node);
                        }
                    else { q.add(iter.getLeft()); }

                    if(iter.getRight() == null)              // Check if the right of the current node is null or what, if it is null go ahead and set right of current with the new node else, if there exists an element already, then add it to the queue;
                        {
                            iter.setRight(new_node);
                        }
                    else{   q.add(iter.getRight());}        }

                }



    public int heightOfTree(TreeNode root)
    {
        if(root == null)    // base case
        {
            return 0;
        }

        return Math.max(heightOfTree(root.getLeft()),heightOfTree(root.getRight())) +1;

    }


    public void make_tree()
        {

        }


}


    // search a bt
    //isIdentical
    // swap





