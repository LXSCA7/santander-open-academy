package dataStructures;

public class Stack {

    private Node top;
    private int height;
    class Node {
        int value;

        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }

    }
    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void getTop() {
        if (top == null) {
            System.out.println("pilha vazia");
            return;
        }
        System.out.println("topo: " + top.value);
    }

    public void getHeight() {
        System.out.println("altura: " + height);
    }

    public void print() {
        System.out.println("####################");
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if (height == 0) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    public Node pop() {
        if (height == 0)
            return null;

        Node temp = top;
        top = top.next;
        temp.next = null;
        height--;

        return temp;
    }

    public static void main(String[] args) {
        Stack myStack = new Stack(4);
        myStack.getTop();
        myStack.getHeight();
        myStack.print();

        myStack.push(1);

        myStack.getTop();
        myStack.getHeight();
        myStack.print();

        System.out.println(myStack.pop().value);
        System.out.println(myStack.pop().value);
    }
}
