package basic;

public class Sequencer implements  Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.print(i+" ");
        }
    }
}
