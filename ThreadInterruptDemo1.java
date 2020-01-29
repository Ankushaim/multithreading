class ChildThread3 extends Thread{
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println("Child Thread");
        }
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            System.out.println("I got interrupted by interrupt method");
        }
    }

}



public class ThreadInterruptDemo1 {
    public static void main(String[] args) {
        ChildThread3 o = new ChildThread3();
        o.start();
        o.interrupt();
        System.out.println("Main thread");
    }
}
