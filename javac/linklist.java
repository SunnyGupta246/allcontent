import java.util.*;

class linklist {
    node head;
    private int size;
    linklist(){
        this.size=0;
    }
    


    class node {
        String data;
        node next;

        node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add
    // public static final String head = null;

    public void add(String data) {
        // Object head;
        // node head=new node(data);
        // node head = new node(data);
        node newNode = new node(data);
        // LL.node head=null;
        if (head == null) {
            head = newNode;
            return;

        }
        newNode.next = head;
        head = newNode;

    }

    public void addlast(String data) {
        node newNode = new node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void deletefirst() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void printList() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print("NULL");
    }

    public void deletelast() {
        if (head == null) {
            System.out.println("The list is empty");
            return;

        }
        size--;
        node secondlast = head;
        node lastnode = head.next;
        while (lastnode.next!= null) {
            lastnode = lastnode.next;
            secondlast = lastnode;
        }
        secondlast.next =null;
    }

    public static void main(String[] args) {
        linklist list = new linklist();
        list.add("a");
        list.add("is");
        list.addlast("b");
        list.addlast("c");
        list.deletefirst();
        list.printList();
        list.deletelast();
        System.out.println();
        list.printList();
        System.out.println(list.get3);
    }
}