/**
 * Created by Lyigezaw on 8/7/2016.
 */
public class BinaryTree {
    Node root;
    public BinaryTree(int data){
        root = new Node(data);
    }
    public void insert(int data){

        if(root == null){
            root = new Node(data);
        }
        else {
            root.insert(data);
        }
    }
    public void delete(int data){

    }
    public Node findPre(int find){
        Node predecessor = null;
        Node current = root;

        if(root == null){
            return null;
        }
        while(current != null && current.getRoot() != find ){
            if(current.getRoot() > find){
                current = current.getLeft();
            }
            else{
                predecessor = current;
                current = current.getRight();
            }
        }

        if(current != null && current.getLeft() != null){
            Node temp = current.getLeft();
            while(temp.getRight() != null){
                temp = temp.getRight();
            }
            predecessor = temp;
        }
        return predecessor;
    }
    public Node findSucc(int find){
        Node successor = null;
        Node current = root;

        if(root == null){
            return null;
        }
        while(current.getRoot() != find) {
            if (current.getRoot() > find) {
                successor = current;
                current = current.getLeft();
            }
            else {
                current = current.getRight();
            }
        }
            if (current != null && current.getRight() != null) {
                Node temp = current.getRight();
                while (temp.getLeft() != null) {
                    temp = temp.getLeft();
                }
                successor = temp;
            }
            return successor;

    }





//    public void insert(int data){
//        root = insert(root,new Node(data));
//    }
//    public Node insert(Node parent, Node add){
//        if(parent == null){
//            return add;
//        }
//        else if(add.getRoot() > parent.getRoot()){
//            parent.setRight(insert(parent.getRight(), add));
//        }
//        else if(add.getRoot() < parent.getRoot()){
//            parent.setLeft(insert(parent.getLeft(), add));
//        }
//        return parent;
//    }


}
