package RR_implementation;

import java.util.ArrayList;

public class CPU_simulation_RR {

    private double time;
    //q (quantum of process execution time), and k(switching time between processes)
    private double q, k;
    private double average;

    public CPU_simulation_RR(double q, double k)
    {
        time=0;
        this.q=q;
        this.k=k;
    }

    public void executionProcess(ArrayList<Double> array)
    {
        System.out.println("Results for the RR algorithm" + "\n");

        int size = array.size();
        double tmp=0;


        while(true)
        {
            for (int i = 0; i < array.size(); i++)
            {
                if (q <= array.get(i))
                {
                    tmp=array.get(i);
                    tmp-=q;
                    time+=(q+k);
                    array.add(i, tmp);
                    array.remove(i+1);
                }
                else if (q>array.get(i))
                {
                    time+=(array.get(i)+k);
                    array.remove(i);
                }
            }

            if(array.size()==0)
                break;
        }

        average = (double) time/size;
        System.out.println("execution time for all processes " + time + " units time");
        System.out.println("average process time "+(double) time/size+" units time" + "\n");
    }

    public double getAverage() {
        return average;
    }
}
