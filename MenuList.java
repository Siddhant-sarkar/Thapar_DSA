import java.util.*;

public class MenuList {
  public static class Node {
    int data;
    Node next;
  }

  public static class LinkedList {
    Node head;
    Node tail;
    int size;

    void addLast(int val) {
      Node temp = new Node();
      temp.data = val;
      temp.next = null;

      if (size == 0) {
        head = tail = temp;
      } else {
        tail.next = temp;
        tail = temp;
      }

      size++;
    }

    public int size() {
      return size;
    }

    public void display() {
      for (Node temp = head; temp != null; temp = temp.next) {
        System.out.print(temp.data + " ");
      }
      System.out.println();
    }

    public void removeFirst() {
      if (size == 0) {
        System.out.println("List is empty");
      } else if (size == 1) {
        head = tail = null;
        size = 0;
      } else {
        head = head.next;
        size--;
      }
    }

    public int getFirst() {
      if (size == 0) {
        System.out.println("List is empty");
        return -1;
      } else {
        return head.data;
      }
    }

    public int getLast() {
      if (size == 0) {
        System.out.println("List is empty");
        return -1;
      } else {
        return tail.data;
      }
    }

    public int getAt(int idx) {
      if (size == 0) {
        System.out.println("List is empty");
        return -1;
      } else if (idx < 0 || idx >= size) {
        System.out.println("Invalid arguments");
        return -1;
      } else {
        Node temp = head;
        for (int i = 0; i < idx; i++) {
          temp = temp.next;
        }
        return temp.data;
      }
    }

    public void addFirst(int val) {
      Node temp = new Node();
      temp.data = val;
      temp.next = head;
      head = temp;

      if (size == 0) {
        tail = temp;
      }

      size++;
    }

    public void addAt(int idx, int val) {
      if (idx < 0 || idx > size) {
        System.out.println("Invalid arguments");
      } else if (idx == 0) {
        addFirst(val);
      } else if (idx == size) {
        addLast(val);
      } else {
        Node node = new Node();
        node.data = val;

        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
          temp = temp.next;
        }
        node.next = temp.next;

        temp.next = node;
        size++;
      }
    }

    public void removeLast() {
      if (size == 0) {
        System.out.println("List is empty");
      } else if (size == 1) {
        head = tail = null;
        size = 0;
      } else {
        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
          temp = temp.next;
        }

        tail = temp;
        tail.next = null;
        size--;
      }
    }

    public void removeAt(int idx) {
      if (idx < 0 || idx >= size) {
        System.out.println("Invalid arguments");
      } else if (idx == 0) {
        removeFirst();
      } else if (idx == size - 1) {
        removeLast();
      } else {
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
          temp = temp.next;
        }

        temp.next = temp.next.next;
        size--;
      }
    }
    public int search(int data){
      Node temp= head;
      int t=0;
      while(temp.next!=null){
        if(temp.data==data){
          return t;
        }
        t++;
        temp=temp.next;
      }
      return -1;
    }

  }
    public static void print(){
      System.out.println("*******************");
      System.out.println("1. Insert At Head");
      System.out.println("2. Insert at tail");
      System.out.println("3. Insert at ___");
      System.out.println("4. Delete At Tail");
      System.out.println("5. Delete At Head");
      System.out.println("6. Delete at ___");
      System.out.println("7. Search the node");
      System.out.println("8. Print the LinkedList");
      System.out.println("*******************");
    }
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    LinkedList ll = new LinkedList();
    int n=0;
    while(true){
      print();
      System.out.println("Enter your option: ");
      n = sc.nextInt();
      if(n==1){
        System.out.println("Enter the input value :");
        ll.addFirst(sc.nextInt());
      }else if(n==2){
        System.out.println("Enter the input value :");
        ll.addLast(sc.nextInt());
      }else if(n==3){
        System.out.println("Enter the position and values");
        ll.addAt(sc.nextInt(),sc.nextInt());
      }else if(n==4){
        System.out.println("Deleting at tail");
        ll.removeLast();
      }else if(n==5){
        System.out.println("Deleting at head ");
        ll.removeFirst();
      }else if(n==6){
        System.out.println("Delete at postion ");
        ll.removeAt(sc.nextInt());
      }else if(n==7){
        System.out.println("Enter the value to be searched");
        int k=ll.search(sc.nextInt());
        if(k==-1){
          System.out.println("The data not found in the linked list");
        }else{
          System.out.println("THe data is at "+k);
        }
      }else if(n==8){
        System.out.println("Now displaying the linked List");
        ll.display();
      }else{
        System.out.println("please enter some valid input");
      }
    }
  }
}