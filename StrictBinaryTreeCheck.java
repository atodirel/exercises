//package interviewEx;
//
////A binary tree is strict when all nodes have either two or zero child nodes.
////Write a method that checks if a binary tree is strict.
////TreeNode API methods: node.left() and node.right().
//
//
//import com.fasterxml.jackson.core.TreeNode;
//import javafx.scene.Node;
//
//public class StrictBinaryTreeCheck {
//
//    class Node{
//        Node left, right;
//
//        Node(Node left, Node right){
//            this.left = left;
//            this.right = right;
//        }
//
//        public TreeNode left(Node node){
//
//        }
//
//
//    }
//
//    public Boolean isStrictTree(TreeNode node) {
//
//        if (node == null) {
//            return true;
//        }
//        if ((node.left() == null && node.right() != null) || (node.left() != null && node.right() == null)) {
//            return false;
//        }
//        return isStrictTree(node.left()) && isStrictTree(node.right());
//    }
//}
