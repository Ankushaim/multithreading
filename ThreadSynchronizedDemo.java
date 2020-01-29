class Display{
    public synchronized void wish(String name)
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.print("Good Morning: ");
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e){}
            System.out.println(name);
        }
    }
}

class MyThreadSync extends Thread{
    Display d;
    String name;
    public MyThreadSync(Display dd, String n) {
        this.d = dd;
        this.name = n;
    }

    public void run()
    {
        d.wish(name);
    }
}


public class ThreadSynchronizedDemo {
    public static void main(String[] args) {
        Display d = new Display();
        MyThreadSync obj1 = new MyThreadSync(d, "Raju");
        MyThreadSync obj2 = new MyThreadSync(d, "Shyam");
        obj1.start();
        obj2.start();


    }
}
