package learning;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Queue<T> extends AbstractQueue<T> {
    private LinkedList<T> elements;
    public Queue() {
        this.elements = new LinkedList<T>();
    }

    @Override
    public Iterator<T> iterator() {
        return elements.iterator();
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public boolean offer(T t) {
        if(t == null) return false;
        elements.add(t);
        return true;
    }

    @Override
    public T poll() {
        Iterator<T> iter = elements.iterator();
        T t = iter.next();
        if(t != null){
            iter.remove();
            return t;
        }
        return null;
    }

    @Override
    public T peek() {
        return elements.getFirst();
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(7);
        q.add(5);

        int first = (int) q.poll();
        int second = (int) q.poll();

        System.out.println(q);

    }

}
