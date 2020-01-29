public class RunnableDemo implements Runnable {
    public void run()
    {
        for (int i = 0; i < 10; i++) // job of thread.
        {
            System.out.println("Child Thread");
        }
    }
}

class ThreadDemo1{
    public static void main(String[] args) {
        RunnableDemo r = new RunnableDemo();
        Thread t = new Thread(r); // Target runnable
        t.start();
        for (int i = 0; i < 10; i++) // Executed by Main thread
        {
            System.out.println("Main Thread");
        }
    }
}

