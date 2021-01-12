package Tester;

import RR_implementation.Array_Filling_Rot;
import RR_implementation.CPU_simulation_RR;
import SJF_implementation.Array_Filling_SJF;
import SJF_implementation.CPU_simulation_SJF;
import Tester_pack.Class_to_tested;

public class Test {
    public static void main(String[] args)
    {
        Class_to_tested test = new Class_to_tested();

        //to show flaws in the test class use the badSJFandFCFSGenerator method
        test.orderExecution();


    }
}
