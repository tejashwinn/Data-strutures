class QueueClass {
    int[] queue;
    int high;
    int low;
    int queueSize;

    QueueClass(int queueSize) {
        this.queue = new int[queueSize];
        this.high = this.low = 0;
        this.queueSize = queueSize;
    }

    void add(int value) {

        this.queue[this.high] = value;
        this.high++;
    }

    int deQueue() {
        int temp = this.queue[this.low];
        this.low++;
        return temp;
    }

    void printQueue() {
        for (int i = this.low; i < high; i++) {
            System.out.println(this.queue[i]);
        }
    }

}

public class Queue {
    public static void main(String[] args) {
        QueueClass q = new QueueClass(10);
        for (int i = 1; i < 5; i++) {
            q.add(i);
        }
        q.deQueue();
        q.printQueue();
    }
}
