/**
 * Created by Lyigezaw on 8/7/2016.
 */
public class Node {
    int data;
    Node left;
    Node right;
    public Node(int root){
        this(root,null,null);
    }
    public Node(int data, Node left, Node right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
    public Node getLeft(){
        return left;
    }
    public Node getRight(){
        return right;
    }
    public int getRoot(){
        return data;
    }
    public boolean isLeaf(){
        return left == null && right == null;
    }
    public Node setLeft(Node left){
        Node oldTree =  this.left;
        this.left = left;
        return oldTree;
    }
    public Node setRight(Node right){
        Node oldTree =  this.right;
        this.right = right;
        return oldTree;
    }
    public int setRoot(int element){
        int oldRoot = this.data;
        this.data = element;
        return oldRoot;
    }

    public void insert(int data){
        if(data == this.data) {
            System.out.println(data + " already exists, ignore.");
            return;
        }

        else if(data < this.data )
        {
            if(left == null){
                left = new Node(data);
                return;
            }
            else {
                left.insert(data);
            }
        }
        else if(data > this.data){
            if(right == null){
                right = new Node(data);
                return;
            }
            else{
                right.insert(data);
            }
        }

    }
    public void preorder(){
        if(this == null)
            return;
        else{
            System.out.print(this.data + " ");
            if(this.left != null){
                this.left.preorder();
            }
            if(this.right != null){
                this.right.preorder();
            }
        }
    }
    public void inorder(){
        if(this == null){
            return;
        }
        else{
            if(this.left != null){
                this.left.inorder();
            }
            System.out.print(this.data + " ");
            if(this.right != null){
                this.right.inorder();
            }

        }
    }
    public void postorder(){
        if(this == null){
            return;
        }
        else{
            if(this.left != null){
                this.left.postorder();
            }

            if(this.right != null){
                this.right.postorder();
            }
            System.out.print(this.data + " ");
        }
    }
}

//    public java.lang.String toString(){
//        StringBuilder buf = new StringBuilder("" + Integer.toString(data));
//        if(isLeaf()){
//            buf.append("(");
//            if(left != null)
//                buf.append(left);
//            if(right != null)
//                buf.append("," + right);
//        buf.append(")");
//        }
//        return buf + "";
//    }