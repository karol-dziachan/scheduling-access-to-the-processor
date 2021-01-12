package FIFO_implementation;

public class Queue_Filling_FIFO {

    QueueLinkedList<Integer> queue;
    private int tmp;


    public Queue_Filling_FIFO()
    {
        queue = new QueueLinkedList<Integer>();
    }


    public QueueLinkedList<Integer> getQueue() {
        return queue;
    }
}
