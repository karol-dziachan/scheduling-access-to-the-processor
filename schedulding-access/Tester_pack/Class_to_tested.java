package Tester_pack;

import FIFO_implementation.CPU_simulation_FCFS;
import FIFO_implementation.QueueLinkedList;
import FIFO_implementation.Queue_Filling_FIFO;
import RR_implementation.Array_Filling_Rot;
import RR_implementation.CPU_simulation_RR;
import SJF_implementation.Array_Filling_SJF;
import SJF_implementation.CPU_simulation_SJF;

import java.util.ArrayList;
import java.util.Scanner;

public class Class_to_tested {

    private int howLong, rangMaks, rangMin;
    private double q, k;
    private int tmp;
    Scanner input;
    private CPU_simulation_RR RRcpu;
    private CPU_simulation_SJF SJFcpu;
    private CPU_simulation_FCFS FIFOcpu;
    private ArrayList<Integer> SJF;
    private ArrayList<Double> rot;
    private QueueLinkedList<Integer> FIFO;

    public Class_to_tested()
    {
        input=new Scanner(System.in);
        setConditions();
        setRot();

        SJF = new ArrayList<Integer>();
        rot = new ArrayList<Double>();
        FIFO = new QueueLinkedList<Integer>();

        Array_Filling_Rot RRGenerator = new Array_Filling_Rot();
        Array_Filling_SJF SJFGenerator = new Array_Filling_SJF();
        Queue_Filling_FIFO FCFSGenerator = new Queue_Filling_FIFO();

        RRcpu= new CPU_simulation_RR(q,k);
        SJFcpu = new CPU_simulation_SJF();
        FIFOcpu = new CPU_simulation_FCFS();

       processesGenerator();

    }

    public void setConditions()
    {
        System.out.println("How many processes do you want to have?");
        this.howLong=input.nextInt();
        //Execution time is random (see other classes)
        System.out.println("Enter the maximum execution time");
        this.rangMaks=input.nextInt();
        System.out.println("Enter the minimum execution time");
        this.rangMin= input.nextInt();

     /* this.howLong=50;
      this.rangMaks=100;
      this.rangMin=1;*/
    }

    private void setRot()
    {
        System.out.println("Enter the quantum of process execution time");
        this.q=input.nextDouble();
        System.out.println("Enter the switching time between processes");
        this.k= input.nextDouble();

      /*  this.q=1.0;
        this.k=0.1;*/
    }

    private void processesGenerator()
    {
        for(int i=0; i<howLong; i++)
        {
            tmp=(int) ((Math.random() * rangMaks) + rangMin);
            this.rot.add((double) tmp);
            this.SJF.add(tmp);
            this.FIFO.addEnd(tmp);
        }

        System.out.println("processes lined up ;) " + "\n");
    }

    public void badSJFandFCFSGenerator()
    {
        tmp= 10;
        this.rot.add((double) tmp);
        this.SJF.add(tmp);
        this.FIFO.addEnd(tmp);

        tmp= 10;
        this.rot.add((double) tmp);
        this.SJF.add(tmp);
        this.FIFO.addEnd(tmp);

        tmp= 10;
        this.rot.add((double) tmp);
        this.SJF.add(tmp);
        this.FIFO.addEnd(tmp);

        tmp= 10;
        this.rot.add((double) tmp);
        this.SJF.add(tmp);
        this.FIFO.addEnd(tmp);

        tmp= 10;
        this.rot.add((double) tmp);
        this.SJF.add(tmp);
        this.FIFO.addEnd(tmp);

        tmp= 10;
        this.rot.add((double) tmp);
        this.SJF.add(tmp);
        this.FIFO.addEnd(tmp);

        tmp= 10;
        this.rot.add((double) tmp);
        this.SJF.add(tmp);
        this.FIFO.addEnd(tmp);

        tmp= 10;
        this.rot.add((double) tmp);
        this.SJF.add(tmp);
        this.FIFO.addEnd(tmp);

        tmp= 10;
        this.rot.add((double) tmp);
        this.SJF.add(tmp);
        this.FIFO.addEnd(tmp);

        tmp= 10;
        this.rot.add((double) tmp);
        this.SJF.add(tmp);
        this.FIFO.addEnd(tmp);

        tmp= 10;
        this.rot.add((double) tmp);
        this.SJF.add(tmp);
        this.FIFO.addEnd(tmp);

        tmp= 10;
        this.rot.add((double) tmp);
        this.SJF.add(tmp);
        this.FIFO.addEnd(tmp);

        tmp= 10;
        this.rot.add((double) tmp);
        this.SJF.add(tmp);
        this.FIFO.addEnd(tmp);

        tmp= 10;
        this.rot.add((double) tmp);
        this.SJF.add(tmp);
        this.FIFO.addEnd(tmp);

        tmp= 10;
        this.rot.add((double) tmp);
        this.SJF.add(tmp);
        this.FIFO.addEnd(tmp);

        tmp= 10;
        this.rot.add((double) tmp);
        this.SJF.add(tmp);
        this.FIFO.addEnd(tmp);

        tmp= 10;
        this.rot.add((double) tmp);
        this.SJF.add(tmp);
        this.FIFO.addEnd(tmp);

        tmp= 10;
        this.rot.add((double) tmp);
        this.SJF.add(tmp);
        this.FIFO.addEnd(tmp);

        tmp= 10;
        this.rot.add((double) tmp);
        this.SJF.add(tmp);
        this.FIFO.addEnd(tmp);

        tmp= 100;
        this.rot.add((double) tmp);
        this.SJF.add(tmp);
        this.FIFO.addEnd(tmp);

        tmp= 100;
        this.rot.add((double) tmp);
        this.SJF.add(tmp);
        this.FIFO.addEnd(tmp);

        tmp= 100;
        this.rot.add((double) tmp);
        this.SJF.add(tmp);
        this.FIFO.addEnd(tmp);

        tmp= 100;
        this.rot.add((double) tmp);
        this.SJF.add(tmp);
        this.FIFO.addEnd(tmp);

        tmp= 100;
        this.rot.add((double) tmp);
        this.SJF.add(tmp);
        this.FIFO.addEnd(tmp);

        tmp= 100;
        this.rot.add((double) tmp);
        this.SJF.add(tmp);
        this.FIFO.addEnd(tmp);

        tmp= 100;
        this.rot.add((double) tmp);
        this.SJF.add(tmp);
        this.FIFO.addEnd(tmp);

        tmp= 100;
        this.rot.add((double) tmp);
        this.SJF.add(tmp);
        this.FIFO.addEnd(tmp);

        tmp= 100;
        this.rot.add((double) tmp);
        this.SJF.add(tmp);
        this.FIFO.addEnd(tmp);

        tmp= 100;
        this.rot.add((double) tmp);
        this.SJF.add(tmp);
        this.FIFO.addEnd(tmp);

        tmp= 100;
        this.rot.add((double) tmp);
        this.SJF.add(tmp);
        this.FIFO.addEnd(tmp);

    }


    public void orderExecution()
    {
        FIFOcpu.executionProcess(this.FIFO);
        SJFcpu.executionProcess(this.SJF);
        RRcpu.executionProcess(this.rot);

        compareAverage();
    }

    public void compareAverage()
    {
        System.out.println("");

        double faverage = FIFOcpu.getAverage();
        double raverage = RRcpu.getAverage();
        double saverage = SJFcpu.getAverage();
        if(faverage < raverage && faverage < saverage)
        {
            System.out.println("The best algorithm turned out to be FCFS");
        }

        if(raverage < faverage && raverage < saverage)
        {
            System.out.println("The best algorithm turned out to be RR");
        }

        if(saverage < raverage && faverage > saverage)
        {
            System.out.println("The best algorithm turned out to be SJF");
        }
    }
}
