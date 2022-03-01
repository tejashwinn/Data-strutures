import java.net.Socket;

public class CircularQueue {
    int[] queue;
    int rear;
    int front;
    int queueSize;

    CircularQueue(int queueSize) {
        this.queue = new int[queueSize];
        this.rear = this.front = -1;
        this.queueSize = queueSize;
    }

    void enQueue(int value) {
        if ((this.rear + 1) % this.queueSize == this.front) {
            System.out.println("Queue is full");
        } else if (this.front == -1) {
            this.front = 0;
            this.rear = 0;
            this.queue[this.rear] = value;
        } else {
            this.queue[++this.rear] = value;
        }
    }

    int deQueue() {
        if (this.front == -1) {
            System.out.println("Queue is empty");
            return -9999999;
        } else if (this.front == this.rear) {
            int temp;
            temp = this.queue[this.rear];
            this.rear = this.front = -1;
            return temp;
        } else {
            this.front++;
            return this.queue[this.front];
        }
    }

    int peek() {
        if (this.front == -1) {
            System.out.println("Queue is empty");
            return -9999999;
        } else {
            return this.queue[this.rear];
        }
    }
}
