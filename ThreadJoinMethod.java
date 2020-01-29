// Main thread is waiting for child thread
class ChildThread extends Thread{
    public void run()
    {
        for (int i =0; i < 5; i++)
        {
            System.out.println("Child Thread");
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}


public class ThreadJoinMethod{
    public static void main(String[] args) throws InterruptedException
    {
        ChildThread c = new ChildThread();
        c.start();
        c.join();
        for (int i =0; i < 5; i++)
        {
            System.out.println("Main Thread");
        }
    }
}
