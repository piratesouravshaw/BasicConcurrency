package concurrentSumExample;

import java.util.ArrayList;

public class Mythread implements Runnable{
    private ArrayList<Long> arr;
    private int l;
    private int r;
    Mythread(ArrayList<Long> arr, int l, int r){
        this.arr = arr;
        this.l = l;
        this.r = r;
    }
    @Override
    public void run() {
        long sum=0;
        for(int i=l;i<=r;i++){
            sum+=arr.get(i);
        }
        Main.s.addAndGet(sum);
        Main.cnt.addAndGet(1);
    }
}
