package SJF_implementation;

public @interface aaa_comment_to_task {
    /*
    For this task I will use the usual arraylist (from "standard" library), which will be properly sorted (the shortest job first).
    Simulating the arrival of new processes will be very easy, because it will consist in the fact that in
    a interval of 130 seconds a new process in the range 1-100 arrives and the processor decides whether to stop
    the execution of the process one or not.
    The principle works similarly to FIFO alg.. I eliminated the last process because it does not count towards the final waiting time.
    To make thing easier, I assumed that the starved process is one whose waiting time is more than 100000000 time units,
    because I to a large degree simplified the arrival of new processes
     */
}
