
public class MyQueue<T> {
    private Object[] arrayQueue;
    private int size;
    private int CAPACITY;
    private int front;
    private int rear;

    public MyQueue(int size) {
        this.size = size;
        this.arrayQueue = new Object[size];
        CAPACITY = 0;
        front = 0;
        rear = -1;
    }

    public void add(T item) {
        if (CAPACITY <= size - 1) {
            arrayQueue[(++rear) % size] = item;
            CAPACITY++;
        } else {
            throw new RuntimeException("Queue is full");
        }
    }

    public T dequeue() {
        if (!isEmpty()) {
            CAPACITY--;
            return (T) arrayQueue[front++];
        }
        throw new RuntimeException("queue is empty");
    }
    public boolean isEmpty(){
        return CAPACITY == 0;
    }
    public T peek(){
        if (!isEmpty()) {
            return (T) arrayQueue[front];
        }
        throw new RuntimeException("queue is empty");
    }
    public void display(){
        if(!isEmpty()){
            for (int i = front; i <= rear; i++) {
                System.out.print(arrayQueue[i%size]+" ");
            }
        }
        else{
            throw new RuntimeException("queue is empty");
        }
    }
    public void clear(){
        CAPACITY=0;
        rear=-1;
        front=0;
    }
}
