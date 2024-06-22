package basic;

public class Main {
    public static void main(String[] args) {
        Thread t1=new Thread(new Sequencer());
        Thread t2=new Thread(new ReverseSequencer());
        t1.start();
        t2.start();
        for(int i=100;i<=109;i++)
            System.out.print(i+" ");
    }
}
/*
 Overview:
1. Here there are 3 threads
2. First is Main thread
3. And the other 2 are custom threads
4. Sequencer and ReverseSequencer are implementation of Runnable with some basic run method implementation
5. Every time the CPU  schedular will decide which thread to execute in time sliced manner
6. t1.start() and t2.start() starts concurrent execution of thread in time sliced manner
7. Everytime the output will be different
*
* */