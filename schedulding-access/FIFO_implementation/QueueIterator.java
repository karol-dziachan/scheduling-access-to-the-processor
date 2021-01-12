package FIFO_implementation;


public class QueueIterator<Integer> implements Iterator<java.lang.Integer> {

    QueueLinkedList<Integer> queue;
    private int help;
    private int round;


    public QueueIterator(QueueLinkedList<Integer> queue)
    {
        this.queue=queue;
        help=queue.size();
        round=1;
    }

    public int next()
    {
        if(hasNext())
        {
            round++;
            return (int) queue.removeBegin();
        }
        else
            return (int) (-1);
    }

    public boolean hasNext()
    {
        if(queue.size()>0 && round<help)
            return true;
        else
            return false;
    }
}
