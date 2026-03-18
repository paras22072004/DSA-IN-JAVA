
public class Main{
    static class Node{
        int data;
        Node left;
        Node right;

         Node(int data){
           this.data = data; 
        }

    }

    public static Node insert(Node root, int m){
        if(root == null){
            root = new Node(m);
            return root;
        }
        if(root.data > m){
            root.left=insert(root.left,m);
        }
        else{
            root.right = insert(root.right , m);
        }
        return root;
    }

    public static void inorder(Node root) {
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }


    //search in BST
    public static boolean Search(Node root, int key){
        if(root == null){
            return false;
        }
        if(root.data == key){
            return true;
        }

        if(root.data>key){
            return Search(root.left, key);
        }else{
            return Search(root.right,key);
        }
    
    }

    //delete a node in BST
    public static Node delete(Node root,int val) {
        if(root.data < val){
            root.right = delete(root.right, val);    
        }
        else if(root.data > val){
            root.left = delete(root.left, val);
        }
        else{
            //case 1 - leaf node
            if(root.left == null && root.right == null){
                return null;
            }
            //case 2 - single node
            if(root.left == null){
                return root.right;
            } 
            else if(root.right== null){
                return root.left;
            }
            //case 3 - both child
             Node is = findthesuccssor(root.right);
             root.data = is.data;
             root.right = delete(root.right, val);
        }
        return root;
    }

    public static Node findthesuccssor(Node root){
      while(root.left != null){ 
        root = root.left;          
      }
      return root;
    }


    //print in range
    public static void printInRange(Node root , int m1, int m2) {
        if(root == null){
          return;
        }
        if(root.data >= m1 && root.data == m2){
            printInRange(root.left, m1, m2);
            System.out.print(root.data+" ");
            printInRange(root.right, m1, m2);
        }
        else if(root.data < m1){
            printInRange(root.left, m1, m2);
        }
        else{
            printInRange(root.right, m1, m2);
        }
    }


    //validate BST
    //mirror

    public static void main(String[] args) {
        int nodes[]={5,1,3,4,2,7};
        Node root = null;
        for (int i = 0; i < nodes.length; i++) {
            root = insert(root, nodes[i]);
        }

        //inorder(root);
        System.out.println(Search(root, 2));

    }
}