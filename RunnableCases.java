public class RunnableCases implements Runnable {
    public void run()
    {
        for (int i = 0; i < 10; i++) // job of thread.
        {
            System.out.println("Child Thread");
        }
    }
}

class ThreadDemo2{
    public static void main(String[] args) {
        RunnableCases r = new RunnableCases();
        Thread t1 = new Thread();
        Thread t2 = new Thread(r); // Target runnable
        t2.run();
        for (int i = 0; i < 10; i++) // Executed by Main thread
        {
            System.out.println("Main Thread");
        }
    }
}

