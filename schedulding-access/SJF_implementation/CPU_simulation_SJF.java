package SJF_implementation;

import java.util.ArrayList;
import java.util.Iterator;

public class CPU_simulation_SJF {

    private int time;
    private double average;

    public CPU_simulation_SJF()
    {
        time = 0;
    }

    public void executionProcess(ArrayList<Integer> array)
    {
        System.out.println("Results for the SJF algorithm" + "\n");

        int tmp;
        int size=array.size();

        //removes the last element of the array, because the last process "does not count" as waiting time for execution
        array.remove(size-1);

        while(array.size()!=0){

            tmp=array.get(0);

           while(true)
           {
               //simulated doing any process through iterations
               time++;
               tmp--;
               if(tmp==0)
               {
                   array.remove(0);
                   break;
               }

               if(time%130==0)
               {
                   //simulation of the arrival of new processes
                   int newProc =(int) ((Math.random()*100)+1);
                   //the number of processes performed increases, so I increase the variable so that you can calculate the average
                   size++;
                   if(newProc<tmp)
                   {
                       /*if the newly arrived processor has a shorter execution time than the current one,
                       then the processor aborting the current one and goes to the new one, after it ends,
                       the one that was previously executed is set in the queue
                        */
                       array.add(0, newProc);
                       array.add(1, tmp);
                       array.remove(2);
                       tmp=array.get(0);
                   }

               }

               /*
               Searching the "starved process" I will create an array that will store the current waiting time
               and return an element if one is too large (described in the annotation)
               */
               ArrayList<Integer> help = new ArrayList<Integer>();
               int tmpTime=0;
               for(int i=0; i<array.size(); i++)
               {
                   tmpTime=0;
                   for(int j=0; j<i; j++)
                   {
                       tmpTime+=array.get(j);
                   }

                   help.add(tmpTime);
               }

               for(int i=0; i<help.size(); i++)
               {
                   //the starved process is removed so that the loop can break and the results can be read
                   if(help.get(i)>=100000000 && i<array.size())
                   {
                       array.remove(i);
                       System.out.println("Resource starvation occurred");
                   }
               }

           }
        }

        average=(double) time/size;

        System.out.println("Waiting time for the process: " + time);
        System.out.println("Average waiting time for the process "+(double) time/size+" units time" + "\n");
    }

    public double getAverage() {
        return average;
    }
}
