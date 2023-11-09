

public class Main {

    public static void main(String[] args) {
//        StackUsingLinkedList stack1 = new StackUsingLinkedList();
//        stack1.display();
//        stack1.pop();
//        stack1.push(10);
//        stack1.push(15);
//        stack1.push(20);
//        stack1.push(40);
//        stack1.push(60);
//        stack1.display();
//        stack1.pop();
//        stack1.display();
//        stack1.pop();
//        stack1.display();
//        stack1.pop();
//        stack1.display();
//        stack1.pop();
//        stack1.display();
//        System.out.println(stack1.peek());
//        stack1.display();
//        stack1.pop();
//        stack1.display();

//        QueueUsingLinkedList Queue1 = new QueueUsingLinkedList();
//
//        System.out.println( Queue1.getFront());
//        System.out.println(Queue1.getSize());
//        System.out.println(Queue1.isEmpty());
//        Queue1.enqueue(10);
//        Queue1.enqueue(30);
//        Queue1.enqueue(40);
//        Queue1.enqueue(50);
//        Queue1.dequeue();
//
//
//        Queue1.displayQueue();
//        System.out.println(Queue1.getSize());
      //  System.out.println(Queue1);
//
//        SimpleTree root = new SimpleTree(10);
//        root.left = new SimpleTree(20);
//        root.right = new SimpleTree(30);
//        root.left.left = new SimpleTree(30);
//        root.left.right = new SimpleTree(40);
//        root.right.left = new SimpleTree(10);
//        root.right.right = new SimpleTree(25);



        BinaryTree t1 = new BinaryTree();
        t1.createNode(10);
        t1.getRoot().setLeft(t1.createNode(20));
        t1.getRoot().setRight(t1.createNode(30));
        t1.getRoot().getLeft().setLeft(t1.createNode(40));
        t1.getRoot().getLeft().setRight(t1.createNode(50));
        t1.getRoot().getRight().setLeft(t1.createNode(60));
        t1.getRoot().getRight().setRight(t1.createNode(70));

       // t1.printLevelOrder();
     //   t1.insert_levelwise(100);
       // t1.printLevelOrder();

        BinaryTree bst = new BinaryTree();
        bst.setRoot(bst.createNode(25));
        // left subtree
        bst.getRoot().setLeft(bst.createNode(20));
        bst.getRoot().setRight(bst.createNode(36));
        bst.getRoot().getLeft().setLeft(bst.createNode(10));
        bst.getRoot().getLeft().setRight(bst.createNode(22));
        bst.getRoot().getLeft().getLeft().setLeft(bst.createNode(5));
        bst.getRoot().getLeft().getLeft().setRight(bst.createNode(12));
        bst.getRoot().getLeft().getLeft().getLeft().setLeft(bst.createNode(1));
        bst.getRoot().getLeft().getLeft().getRight().setRight(bst.createNode(15));
        // right subtree
        bst.getRoot().getRight().setLeft(bst.createNode(30));
        bst.getRoot().getRight().setRight(bst.createNode(40));
        bst.getRoot().getRight().getLeft().setLeft(bst.createNode(28));
        bst.getRoot().getRight().getRight().setLeft(bst.createNode(38));
        bst.getRoot().getRight().getRight().setRight(bst.createNode(48));
        bst.getRoot().getRight().getRight().getRight().setLeft(bst.createNode(45));
        bst.getRoot().getRight().getRight().getRight().setRight(bst.createNode(50));



        System.out.println(t1.heightOfTree(t1.getRoot()));
        System.out.println(bst.heightOfTree(bst.getRoot()));
        bst.printLevelOrder();
//        System.out.println("Inorder traversal " );
//        t1.InOrder(t1.getRoot());
//        System.out.println("\n");
//
//        System.out.println("Pre order traversal " );
//        t1.PreOrder(t1.getRoot());
//        System.out.println("\n");
//
//        System.out.println("Post order traversal " );
//        t1.PostOrder(t1.getRoot());
//        System.out.println("\n");
//
//
//        System.out.println( "Sum of all Non Leaf Nodes : " +  t1.sumOfNonLeafNodes());
//        System.out.println( "Sum of all Leaf Nodes : " +  t1.sumOfLeafNodes());
//        //
//        System.out.println(root.data);
//        System.out.println(t1.getRoot().getLeft().getData());
//        System.out.println(t1.getRoot().getRight().getData());
//        TreeNode rooted = new TreeNode(10);



      //  t1.setRoot(rooted);


//        t1 = new TreeNode(10);



    }

}
