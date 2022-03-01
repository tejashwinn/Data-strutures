
class Stack {

    private int[] stack;
    private int pointer;
    private int stackSize;

    Stack(int stackSize) {
        this.stack = new int[stackSize];
        this.pointer = -1;
        this.stackSize = stackSize;
    }

    int pop() {
        if (this.pointer != -1) {
            int tempVar = this.stack[this.pointer];
            this.pointer--;
            return tempVar;
        } else {
            System.out.println("Stack is empty");
            return -999999999;
        }
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

    int[] returnStack() {
        if (this.pointer == -1) {
            return null;
        } else {
            int[] tempStack = new int[this.pointer + 1];
            for (int i = 0; i <= this.pointer; i++) {
                tempStack[i] = this.stack[i];
            }
            return tempStack;
        }
    }

}
