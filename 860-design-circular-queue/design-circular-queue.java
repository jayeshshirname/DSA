class MyCircularQueue {
    private int[] queue;
    private int front; 
    private int rear;  
    private int size;  
    private int capacity;
    public MyCircularQueue(int k) {
        queue = new int[k]; 
        front = 0;
        rear = 0;
        size = 0;
        capacity = k;
    }

    public boolean enQueue(int value) {
        if (!isFull()) {
            queue[rear] = value;
            rear = (rear + 1) % capacity; // Move rear circularly
            size++;
            return true;
        }
        return false; // Queue is full
    }

    // Remove an element from the queue
    public boolean deQueue() {
        if (!isEmpty()) {
            front = (front + 1) % capacity; // Move front circularly
            size--;
            return true;
        }
        return false; // Queue is empty
    }

    // Get the front element of the queue
    public int Front() {
        if (!isEmpty()) {
            return queue[front];
        }
        return -1; // Queue is empty
    }

    // Get the rear element of the queue
    public int Rear() {
        if (!isEmpty()) {
            return queue[(rear - 1 + capacity) % capacity]; // Handle circular rear
        }
        return -1; // Queue is empty
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */