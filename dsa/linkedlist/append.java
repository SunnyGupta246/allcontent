public class append {
    private node head;
    private node tail;
    public int length;

    class node {
        int value;
        node next;

        node(int value) {
            this.value = value;
        }

    }

    public append(int value) {
        node newnode = new node(value);
        head = newnode;
        tail = newnode;
        length = 1;
    }

    public void print() {
        node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public node remove() {
        if (length == 0) {
            return null;
        }
        node hp = head;
        node kp = head;
        while (hp.next != null) {
            kp = hp;
            hp = hp.next;
        }
        tail = kp;
        tail.next = null;
        length--;
        return hp;
    }

    static public void main(String[] args) {
        append myLinkedList = new append(4); // its menotary to use append name because we create append.java
        myLinkedList.add(5);
        myLinkedList.add(8);
        // System.out.println(myLinkedList.remove().value);
        myLinkedList.prepend(9);
        // System.out.println(myLinkedList.removefirst().value);
        // System.out.println(myLinkedList.get(1).value);
        myLinkedList.reverse();

        myLinkedList.print();

    }

    private void add(int value) {
        node newnode = new node(value);
        if (length == 0) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
        length++;

    }

    private void prepend(int value) {
        node newnode = new node(value);
        newnode.next = head;
        head = newnode;
    }

    public node removefirst() {
        node temp = head;
        node heap = head;
        head = head.next;
        temp.next = null;

        return heap;

    }

    private node get(int index) {
        if (index < 0 || index > length)
            return null;
        node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;

    }

    public void reverse() {
        node temp = head;
        head = tail;
        tail = temp;
        node after = temp.next;
        node before = null;
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }

    }

}
