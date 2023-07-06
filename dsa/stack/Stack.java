package stack;

public class Stack {
    public Stack(int i) {
    }

    private Node top;
    private static Node height;

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

    public Stack (int value ){
        Node newnode=new Node(value );
        top = newnode;
        height=1;

    }

        public void getTop() {

        }

        public static void main(String[] args) {
            Stack mystack = new Stack(4);
            mystack.getTop();
            mystack.getHeight();
            mystack.printStack();
        }

    }

    public void getTop() {
    }

    public void printStack() {
    }

    public void getHeight() {
    }
}
