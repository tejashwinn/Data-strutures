class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class DynamicStack {
    Node top;

    DynamicStack() {
        this.top = null;
    }

    void push(int value) {
        Node newNode = new Node(value);
        newNode.next = this.top;
        this.top = newNode;
    }

    int pop() {
        if (this.top == null) {
            System.out.println("underflow");
            return -99999999;
        }
        int temp = this.top.value;
        this.top = this.top.next;
        return temp;
    }

    void print() {
        Node ptr = this.top;
        if (ptr == null) {
            System.out.println("No elements");
        }
        while (ptr != null) {
            System.out.println(ptr.value);
            ptr = ptr.next;
        }
    }

    int peek() {
        if (this.top != null) {
            return this.top.value;
        }
        return -99999999;
    }

}
