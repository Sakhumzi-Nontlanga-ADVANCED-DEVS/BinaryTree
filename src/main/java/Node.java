
public class Node {
     int value;
        Node left;
        Node right;
        public Node (int value) {
        this.value = value;
        this.left = null;
        this.right = null;
        }
        public int getValue(){
            return value;
        }
        public Node getLeft(){
            return left;
        }
        public Node getRight(){
            return right;
        }
        public void Disp(){
            System.out.println(value);
            if( left != null){
                left.Disp();
            } else{System.out.println("*");}
            
            if( right != null){
                right.Disp();
            } else{System.out.println("*");}
        }
}
