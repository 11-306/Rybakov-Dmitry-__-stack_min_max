import java.util.Deque;
import java.util.LinkedList;

public class MyStack<E extends Comparable<E>> {
    private Deque<E> data;
    private Deque<E> min;
    private Deque<E> max;
    public MyStack(){
        data=new LinkedList<>();
        min=new LinkedList<>();
        max=new LinkedList<>();
    }
    public void push(E item){
        data.push(item);
        if (min.isEmpty() || min.peek().compareTo(item) >= 0) {
            min.push(item);
        }
        if (max.isEmpty() || max.peek().compareTo(item) <= 0) {
            max.push(item);
        }
    }
    public E pop(){
        if(data.peek().compareTo(min.peek())==0){
            min.pop();
            return data.pop();
        }
        if(data.peek().compareTo(max.peek())==0){
            max.pop();
            return data.pop();
        }
        return data.pop();
    }
    public E getMin(){
        if(min.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return min.peek();
    }
    public E getMax(){
        if(max.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return max.peek();
    }


}
