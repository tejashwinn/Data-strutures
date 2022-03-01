
class StackClass {

    int[] stack;
    int pointer;
    int stackSize;

    StackClass(int stackSize) {
        this.stack = new int[stackSize];
        this.pointer = -1;
        this.stackSize = stackSize;
    }

    int pop() {
        int tempVar = this.stack[this.pointer];
        this.pointer--;
        return tempVar;
    }

    void push(int value) {
        if (pointer < stackSize - 1) {
            this.pointer++;
            this.stack[pointer] = value;
        } else {
            System.out.println("Stack Full");
        }
    }

    void printStack() {
        for (int i = 0; i <= pointer; i++) {
            System.out.println(this.stack[i]);
        }
        System.out.println("");
    }
}

public class Stack {
    public static void main(String[] args) {

        StackClass stack = new StackClass(5);
        for (int i = 1; i < 6; i++) {
            stack.push(i);
        }
        stack.printStack();
        for (int i = 0; i < 4; i++) {
            stack.pop();
        }
        stack.printStack();

    }
}
