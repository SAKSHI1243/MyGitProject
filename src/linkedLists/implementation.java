package linkedLists;
public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedList {
        Node tail = null;
        Node head = null;
        void insertAtEnd(int data) {
            Node temp = head;
            Node newnode = new Node(data);
            if (head == null) head = newnode; //empty list
            else {//list already has some items
                while (temp.next != null) temp = temp.next;
                temp.next = newnode;
                newnode.next = null;
            }
        }
        void insertAtBeginning(int data) {
            Node newnode = new Node(data);
            if (head == null) head = newnode;
            else {
                newnode.next = head;
                head = newnode;
            }
        }

        void insertAtPosition(int data, int pos) {
            int i = 1;
            Node temp = head;
            Node newnode = new Node(data);
            if (pos == size()) insertAtEnd(data);
            else if (pos == 1) insertAtBeginning(data);
            else if (pos < 1 || pos > size() + 1) System.out.println("please enter valid position");
            else {
                while (i < pos - 1) {
                    temp = temp.next;
                    i++;
                }
                newnode.next = temp.next;
                temp.next = newnode;
            }
        }
        int getAt(int pos) {
            Node temp = head;
            int i = 1;
            if (pos < 0 && pos > size()) {
                System.out.println("invalid position.");
                return -1;
            } else {
                while (i < pos) {
                    temp = temp.next;
                    i++;
                }
                return temp.data;
            }
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        void deleteAtPosition(int pos) {
            int size=size();
            Node temp = head;
            if(pos<1 || pos>size()) System.out.println("invalid input");
            else if(pos==1) head= head.next;
            else if(pos==size()){
                while(temp.next!=null) temp=null;
            }
            else{
                int i=1;
                while(i<pos-1)temp=temp.next;
                temp.next=temp.next.next;
                tail=temp;
            }
            size--;
            System.out.println(tail.data+" "+size);
        }
        void deleteNode(rough.Node node){
            node.data=node.next.data;
            node.next=node.next.next;
        }
    }
    public static void main(String[] args) {
        linkedList ll= new linkedList();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(12);
        ll.insertAtBeginning(8);
        ll.insertAtPosition(3,1);
        ll.insertAtPosition(9,2);
        ll.insertAtPosition(7,3);
        ll.display();
        System.out.println();
        System.out.println("size of linkedList = "+ll.size());
        System.out.println(ll.getAt(5));
        System.out.println("elements after deletion:");
        ll.deleteAtPosition(2);
        ll.display();
    }
}
