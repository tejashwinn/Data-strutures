class Queue {
    private int[] queue;
    private int high;
    private int low;
    private int queueSize;

    Queue(int queueSize) {
        this.queue = new int[queueSize];
        this.high = this.low = -1;
        this.queueSize = queueSize;
    }

    void enQueue(int value) {
        if (this.high < this.queueSize - 1) {
            this.queue[++this.high] = value;
            if (this.low == -1) {
                this.low = 0;
            }
        } else {
            System.out.println("Queue is full");
        }
    }

    int deQueue() {
        if (this.low > this.high) {
            System.out.println("Queue is Empty");
            return -9999999;
        } else if (this.high == this.low && this.low != -1) {
            this.low = -1;
            this.high = -1;
            return this.queue[high];
        } else if (this.high > this.low) {
            int temp = this.queue[this.low];
            this.low++;
            return temp;
        } else {
            System.out.println("Queue is Empty");
            return -9999999;
        }
    }

    void printQueue() {
        if (this.high != -1 && this.low != -1) {
            for (int i = this.low; i <= high; i++) {
                System.out.println(this.queue[i]);
            }
        }
        System.out.println("");
    }

    int[] returnQueue() {
        if (high != -1 && low != -1) {
            int[] tempQueue = new int[this.high - this.low + 1];
            int j = -1;
            // System.out.println(this.high - this.low + 1);
            for (int i = this.low; i <= this.high; i++) {
                tempQueue[++j] = this.queue[i];
            }
            return tempQueue;
        }
        return null;
    }
}
