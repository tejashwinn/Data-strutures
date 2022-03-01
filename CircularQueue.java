import java.net.Socket;

public class CircularQueue {

	private int[] queue;
	private int rear;
	private int front;
	private int queueSize;

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
			this.rear = (this.rear + 1) % this.queueSize;
			this.queue[this.rear] = value;
		}
	}

	int deQueue() {
		if (this.front == -1) {
			System.out.println("Queue is empty");
			return -9999999;
		} else if (this.front == this.rear) {
			int temp;
			temp = this.queue[this.front];
			this.rear = this.front = -1;
			return temp;
		} else {
			int temp;
			temp = this.queue[this.front];
			this.front = (this.front + 1) % this.queueSize;
			return temp;
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

	void printQueue() {
		if (this.front == -1) {
			System.out.println("Queue empty");
		} else {
			if (this.front <= this.rear) {
				for (int i = this.front; i <= this.rear; i++) {
					System.out.print(this.queue[i]);
				}
			} else {
				for (int i = this.front; i < this.queueSize; i++) {
					System.out.print(this.queue[i]);
				}
				for (int i = 0; i <= this.rear; i++) {
					System.out.print(this.queue[i]);
				}
			}
		}
		System.out.println("");
	}

	void print() {
		for (int x : this.queue) {
			System.out.print(x);
		}
		System.out.println("");
	}

	int[] returnQueue() {
		if (this.front == -1) {
			return null;
		} else {
			int[] tempQueue = new int[this.queueSize];
			int count = -1;
			if (this.front <= this.rear) {
				for (int i = this.front; i <= this.rear; i++) {
					tempQueue[++count] = this.queue[i];
				}
			} else {
				for (int i = this.front; i < this.queueSize; i++) {
					tempQueue[++count] = this.queue[i];
				}
				for (int i = 0; i <= this.rear; i++) {
					tempQueue[++count] = this.queue[i];
				}
			}
			return tempQueue;
		}
	}
}
