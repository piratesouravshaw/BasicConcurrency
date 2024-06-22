package callstack;

public class Main {
    public static void main(String[] args) {
            try{
                Thread t1=new Thread(new MyRunnable());
                t1.start();
            }
            catch(Exception e){
                System.out.println("Caught the exception"+e);
            }
    }
}
/*
 Overview:
 1. This exception will not be caught as the threads have separate call stack
 2. Also threads does not return anything to another thread since the call stack is different
 3. We can also infer point 2 as this is the reason why thread class methods donot return anything
 4. Incase we need the cumulative computation of all threads then we have to opt for shared variables or resources approach
* */
