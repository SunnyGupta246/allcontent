import java.util.*;

public class BinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class binerytre {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;

            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
public static int height(Node root){
    if(root==null)
    {
        return 0;
    }
int lefthieght=height(root.left);
int righthieght = height(root.right );
int myhight =Math.max(lefthieght,righthieght)+1;
return myhight;
}
   public static void levelorder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static int sumofnode(Node root){
        if(root==null)
        {
            return 0;
        }
        int leftsum=sumofnode(root.left);
        int rightsum=sumofnode(root.right);

        return leftsum+rightsum+root.data;
    }
    public static int countofnode(Node root){
        if(root==null)
        {
            return 0;
        }
        int leftnode=countofnode(root.left);
        int rightnode=countofnode(root.right);

        return leftnode+rightnode+1;
    }

    public static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        // postOrder(root.data+" ");
        System.out.print(root.data + " ");
    }

    public static void main(String args[]) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        binerytre tree = new binerytre();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);
        preOrder(root);
        System.out.println();
        System.out.println("...............");
        inorder(root);
        System.out.println();
        System.out.print("...............");
        System.out.println();
        postOrder(root);
        System.out.println();
        System.out.print("...............");
        System.out.println();
        levelorder(root);
        // System.out.println();
        System.out.print("...............");
        System.out.println();
        System.out.println(countofnode(root));
        System.out.print("...............");
        System.out.println();
        System.out.println(sumofnode(root));
        System.out.print("...............");
        System.out.println();
        System.out.println(height(root));

    }
}