package FIFO_implementation;

import java.util.Iterator;

public class CPU_simulation_FCFS {

    private int time;
    private double average;

    public CPU_simulation_FCFS()
    {
        time=0;
    }

    public void executionProcess(QueueLinkedList<Integer> queue)
    {
        System.out.println("Results for the FIFO algorithm" + "\n");

        QueueIterator<Integer> i = new QueueIterator<Integer>(queue);
        int size = queue.size();
        int tmp;


        while(i.hasNext())
        {
            tmp=0;
            tmp=i.next();
            for(int j=0; j<tmp; j++)
            {
                //simulated doing any process through iterations
                time++;
                if(time%130==0)
                    //simulation of the arrival of new processes
                    queue.addEnd((int) ((Math.random()*100)+1));
            }
        }

        average= (double) time/size;

        System.out.println("Waiting time for the process: " + time);
        System.out.println("Average waiting time for the process "+(double) time/size+" units time" + "\n");

    }

    public double getAverage() {
        return average;
    }
}
