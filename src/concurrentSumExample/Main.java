package concurrentSumExample;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static AtomicLong s = new AtomicLong(0);
    public static AtomicInteger cnt=new AtomicInteger(0);
    private static void concurrentSum(ArrayList<Long>arr){
        Thread t1=new Thread(new Mythread(arr,0,24));
        Thread t2=new Thread(new Mythread(arr,25,49));
        Thread t3=new Thread(new Mythread(arr,50,79));
        Thread t4=new Thread(new Mythread(arr,80,99));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        while(Main.cnt.get()<4){}
        System.out.println(Main.s.get());

    }
    private static void sequentialSum(ArrayList<Long> arr){
        long sum=0;
        for(int i=0;i<arr.size();i++){
            sum+=arr.get(i);
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        ArrayList<Long>arr=new ArrayList<>();
        Random random=new Random();
        for(int i=0;i<100000;i++){
            arr.add(random.nextLong()%10000);
        }
        long a=System.currentTimeMillis();
        sequentialSum(arr);
        long b=System.currentTimeMillis();
        System.out.println(b-a);


        long a1=System.currentTimeMillis();
        concurrentSum(arr);
        long b1=System.currentTimeMillis();
        System.out.println(b1-a1);
    }
}
