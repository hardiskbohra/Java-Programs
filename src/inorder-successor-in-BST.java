
// Find inorder successor in the binary search tree

/*
Algorithm :

      1) If right subtree of node is not NULL, then succ lies in right subtree. Do following.
        Go to right subtree and return the node with minimum key value in right subtree.
      2) If right sbtree of node is NULL, then succ is one of the ancestors. Do following.
        Travel up using the parent pointer until you see a node which is left child of it’s parent. The parent of such a node is the succ.
*/

class Node {

    int data;
    Node left, right, parent;

    Node(int d) {
        data = d;
        left = null;
        right = null;
        parent = null;
    }
}

class BinaryTree {

    static Node head;

    Node insert(Node node, int data) {

        if (node == null) {
            return (new Node(data));
        }
        else {

            Node temp = null;

            if (data <= node.data) {
                temp = insert(node.left, data);
                node.left = temp;
                temp.parent = node;

            } else {
                temp = insert(node.right, data);
                node.right = temp;
                temp.parent = node;
            }

            return node;
        }
    }

    Node inOrderSuccessor(Node root, Node n) {

        // step 1 of the above algorithm
        if (n.right != null) {
            return minValue(n.right);
        }

        // step 2 of the above algorithm
        Node p = n.parent;
        while (p != null && n == p.right) {
            n = p;
            p = p.parent;
        }
        return p;
    }

    Node minValue(Node node) {
        Node current = node;

        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        Node root = null, temp = null, suc = null, min = null;
        root = tree.insert(root, 20);
        root = tree.insert(root, 8);
        root = tree.insert(root, 22);
        root = tree.insert(root, 4);
        root = tree.insert(root, 12);
        root = tree.insert(root, 10);
        root = tree.insert(root, 14);
        temp = root.left.right.right;
        suc = tree.inOrderSuccessor(root, temp);
        if (suc != null) {
            System.out.println("Inorder successor of " + temp.data +
                                                      " is " + suc.data);
        } else {
            System.out.println("Inorder successor does not exist");
        }
    }
}
