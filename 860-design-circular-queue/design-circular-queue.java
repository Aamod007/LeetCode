class MyCircularQueue {
    int [] arr;
    int count;
    int maxSize;
    int head;

    public MyCircularQueue(int k) {
        arr = new int[k];
        count = 0;
        maxSize = k;
        head = 0;
    }
    
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        arr[(head + count) % maxSize] = value;
        count = count + 1;
        return true;
    }
    
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        head = (head+1) % maxSize;
        count = count - 1;
        return true;
    }
    
    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return arr[head];
    }
    
    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return arr[(head + count - 1) % maxSize];
    }
    
    public boolean isEmpty() {
        return count == 0;
    }
    
    public boolean isFull() {
        return count == maxSize;
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