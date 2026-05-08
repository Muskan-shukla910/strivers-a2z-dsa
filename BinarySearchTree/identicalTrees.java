public class identicalTrees {
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
     public static boolean isIdentical(Node node, Node subroot) {
            if (node == null && subroot == null) {
                return true;
            } else if (node == null || subroot == null || node.data != subroot.data) {
                return false;
            }
            if (!isIdentical(node.left, subroot.left)) {
                return false;
            }
            if (!isIdentical(node.right, subroot.right)) {
                return false;
            }
            return true;

        }

        // ye Subroot bs pahle root value dekh rha hai hum es sabse pahle hum yhi chekc
        // krenge ki kya root same hai agr nhi toh left jaoo ya right jaao baha dekho
        // same hai agr yes haii root same mil gya toh check kro ki kyaa identical hai
        // if yess then true

    // mere subroot ,main tree me kaha pr liw krte haii
    public static boolean isSubtree(Node root, Node subroot) {
        if (root == null) {
            return false;
        }
        if (root.data == subroot.data) {
            if (isIdentical(root, subroot)) {
                return true;
            }
        }

        boolean left = isSubtree(root.left, subroot);
        boolean right = isSubtree(root.right, subroot);
        return left || right;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(6);
        root.right.left = new Node(7);
        root.right.right = new Node(8);

        /**
         * 2
         * / \
         * 4 5
         **/
        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);
        System.out.println(isSubtree(root, subroot));
    }
}
