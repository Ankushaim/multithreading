//Child Thread is waiting for main thread
class ChildThread1 extends Thread{
    static Thread mt;
    public void run()
    {
        try {
            mt.join();
        }
        catch (InterruptedException e){}

        for (int i = 0; i < 5; i++)
        {
            System.out.println("Child thread");
        }
    }
}



public class ThreadJoinMethod1{
    public static void main(String[] args) throws InterruptedException {
        ChildThread1.mt = Thread.currentThread();
        ChildThread1 ct = new ChildThread1();
        ct.start();
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Main thread");
            Thread.sleep(2000);
        }
    }
}
