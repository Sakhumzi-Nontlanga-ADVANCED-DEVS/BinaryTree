
public class NewMain {
    public static void main(String[] args) {
        Node root;
        Node NT4 = new Node(4);
        Node NT9 = new Node(9);
        Node NT15 = new Node(15);
        Node NT2 = new Node(2);
        Node NT16 = new Node(16);
        Node NT11 = new Node(11);
        Node NT10 = new Node(10);
        Node NT6 = new Node(6);
        Node NT5 = new Node(5);
        Node NT13 = new Node(13);
        Node NT1 = new Node(1);
        Node NT3 = new Node(3);
        
        NT16.right=NT2;
        NT15.right=NT4;
        NT15.left=NT9;
        NT16.left=NT15;
        NT10.right=NT16;
        NT10.left=NT11;
        NT3.right = NT10;
        NT5.left=NT6;
        NT1.right=NT5;
        NT1.left=NT13;
        NT3.left=NT1;
        root=NT3;
        
        
        
        
        
        
        
        
        
        
        
        
        root.Disp();
    }
    
}
