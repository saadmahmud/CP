public class LinkedList{

     class Node{
        int data;
        Node next;

       public Node(){
           data = -1;
           next = null;
        }
       public Node(int _data){
            data = _data;
            next = null;
        }
    }

    Node head;

    public void initHead(){
        head = new Node();
    }

    public void addNewNode(int data){
        Node curNext = head.next;

        Node a = new Node(data);
        head.next = a;
        a.next = curNext;
    }

    public int findNode(int position) {
        Node curNode = head.next;

        for (int i = 0; i < position - 1; i++) {
            curNode = curNode.next;
        }

        return curNode.data;
    }
    
    public void reverseCurList(){
        
    }

    public void printAll() {
        Node nextNode = head.next;

        System.out.print("Nodes: ");

        while (nextNode.next != null) {
            System.out.print(nextNode.data);
            nextNode = nextNode.next;
        }

        System.out.println(nextNode.data);
    }
    
    public static void main(String[] args) {

        LinkedList list= new LinkedList();
        
        list.initHead();
       
        list.addNewNode(1);
        list.addNewNode(2);
        list.addNewNode(3);
        list.addNewNode(4);
        list.addNewNode(5);
        list.addNewNode(6);

       list.printAll();

       System.out.println(list.findNode(3));
      }
}