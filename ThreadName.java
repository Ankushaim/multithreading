public class ThreadName extends Thread {
    @Override
    public void run() {
        System.out.println("Run");
    }
}

class ThreadDemo3{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        ThreadName n = new ThreadName(); //Creating child thread
        System.out.println(n.getName());
        n.start();
        n.setName("Ankush");
        System.out.println(n.getName());
        System.out.println(Thread.currentThread().getName());


    }
}

