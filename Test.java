// This is defining a thread
class MyThread extends Thread {
    public void run()
    {
        for (int i = 0; i < 10; i++) // job of thread.
        {
            System.out.println("Child Thread");
        }
    }
}

class ThreadDemo
{
    public static void main(String[] args) {
        MyThread t = new MyThread(); // Thread initialization
        t.start(); // Starting thread
        for (int i = 0; i < 10; i++) // Executed by Main thread
        {
            System.out.println("Main Thread");
        }
    }
}
