package FIFO_implementation;

public interface Queue<Integer> {

    public boolean isEmpty();
    public int removeBegin();
    public void addEnd(int data);
    public int size();

}
