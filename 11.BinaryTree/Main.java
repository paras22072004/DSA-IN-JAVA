import java.util.*;

public class Main{
    static class Node{
        int data;
        Node right;
        Node left;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
        static class BinaryTree{
            static int idx = -1;
              public static Node builtTree(int nodes[]){
                  idx++;
                  if(nodes[idx] == -1){
                    return null;
                  }
                  Node newNode = new Node(nodes[idx]);
                  newNode.left = builtTree(nodes);
                  newNode.right = builtTree(nodes);
                  return newNode;
              }         
        }
        
    public static void preorder(Node root){{
        if(root == null){
            System.err.println(-1+ " ");
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
    }

     public static void inorder(Node root){{
        if(root == null){
            System.err.println(-1+ " ");
            return;
        }
        preorder(root.left);
        System.out.println(root.data);
        preorder(root.right);
    }
    }

    public static void postorder(Node root){{
        if(root == null){
            System.err.println(-1+ " ");
            return;
        }
        preorder(root.left);
        preorder(root.right);
        System.out.println(root.data);
    }
    }

    //level order traversal
    public static void levelOder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node curr = q.remove();
            if(curr == null){
                System.out.println("");
                //queue empty
                if(q.isEmpty()){
                    break;
                }else {
                    q.add(null);
                }
            }
            else{
                System.out.println(curr.data+ " ");
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right!= null){
                    q.add(curr.right);
                }
            }
        }

    }

    // height of tree
    public static int height(Node root) {
        if(root == null){
            return 0;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        return Math.max(leftheight, rightheight)+1;
    }

    //count nodes 
    public static int countNode(Node root){
      if(root == null){
        return 0;
      }
      int leftNode = countNode(root.left);
      int rightNode = countNode(root.right);
      return leftNode + rightNode + 1;
    }
    

    //diameter of tree
    public static int diameter(Node root){
        if(root == null){
            return 0;
        }

        int dia1 = height(root.left)+height(root.right)+1;
        int dia2 = diameter(root.left);
        int dia3 = diameter(root.right);
        return Math.max(dia1,Math.max(dia2, dia3));
    }

    //approach 2nd
    // static class Info{
    //     int diam;
    //     int ht;

    //     public Info(int diam,int ht){
    //       this.diam = diam;
    //       this.ht = ht;
    //     }
    // }


    // public static Info diameter(Node root){
    //     if(root == null){
    //         return new Info(0,0);
    //     }
    //   Info leftinfo = diameter(root.left);
    //   Info rightinfo = diameter(root.right);

    //   int diam = Math.max(Math.max(leftinfo.diam,rightinfo.diam),leftinfo.ht + rightinfo.ht+1);
    //   int ht = Math.max(leftinfo.ht , rightinfo.ht) + 1;

    //  return new Info(diam,ht);
    // }
    

    // subtree of another tree
    public static boolean isIdentical(Node node , Node subRoot){
      if(node == null && subRoot == null){
        return true;
      }else if(node == null || subRoot == null || node.data != subRoot.data){
        return false;
      }

      if(!isIdentical(node.left, subRoot.left)){
        return false;
      }

      if(!isIdentical(node.right, subRoot.right)){
        return false;
      }

      return true;
    }
    public static boolean isSubTree(Node root,Node subRoot){
        if(root == null){
            return false;
        }
     if(root.data == subRoot.data){
        if(isIdentical(root,subRoot)){
            return true;
        }
     }
     return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
    }

 public static void main(String[] args){
    //   int nodes[]= {1,2,4,-1,-1, 5, -1, -1, 3, -1, 6, -1, -1};
    //   BinaryTree tree = new BinaryTree();

    //   Node root = tree.builtTree(nodes);

    //   System.out.println();
    //   preorder(root);
    //   System.out.println("break");
    //   inorder(root);
    //   System.out.println("break");
    //   postorder(root);
    // levelOder(root);
    // System.out.println(diameter(root));
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right= new Node(7);

    Node subRoot = new Node(2);
    subRoot.left = new Node(49);
    subRoot.right = new Node(5);

    System.out.println(isSubTree(root, subRoot));
    
 }
}