import java.util.*;
class DoublyLinkedList
{
    class Node
    {
        int data;
        Node next;
        Node prev;

        public Node(int data)
        {
            this.data=data;
        }
    }

    Node head,tail=null,temp;
    Scanner sc =new Scanner(System.in);
    public void createNode()
    {
        for(int i=0;i<5;i++)
        {
            int data;
            System.out.println("Enter data: ");
            data = sc.nextInt();
            Node n = new Node(data);
            n.next=null;
            n.prev=null;
            if(head==null)
            {
                head=n;
                tail=n;
            }
            else
            {
                tail.next=n;
                n.prev=tail;
                tail=n;
            }
        }
    }
    public void displayForward()
    {
        temp=head;
        if(head==null)
        {
            System.out.println("Doubly linked list is Empty");
            return;
        }
        System.out.println("DLL elements are: ");
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void deleteNode()
    {
        int key;
        Node temp = head,prev = null;
        System.out.println("Enter the node you want to delete:");
        key=sc.nextInt();
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null)
            return;
        prev.next = temp.next;
        
    }
}
class DLL
{
    public static void main(String args[])
    {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.createNode();
        dll.displayForward();
        dll.deleteNode();
        dll.displayForward();
    }
}
