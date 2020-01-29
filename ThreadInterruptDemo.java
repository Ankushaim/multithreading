class ChildThread2 extends Thread{
    public void run()
    {
        try {
            for (int i = 0; i < 5; i++)
            {
                System.out.println("Child Thread");
                Thread.sleep(2000);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("I got interrupted by interrupt method");
        }
    }

}



public class ThreadInterruptDemo {
    public static void main(String[] args) {
        ChildThread2 o = new ChildThread2();
        o.start();
        o.interrupt();
        System.out.println("Main thread");
    }
}
