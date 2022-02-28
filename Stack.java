
class StackClass {

    int[] stack;
    int n;

    StackClass(int stackSize) {
        this.stack = new int[stackSize];
        this.n = -1;
    }

    int pop() {
        int temp = this.stack[this.n];
        this.n--;
        return temp;
    }

    void push(int value) {
        this.stack[++n] = value;
    }
}

public class Stack {
    public static void main(String[] args) {
        StackClass stack = new StackClass(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
        for (int i : stack.stack) {
            System.out.println(i);
        }
    }
}
