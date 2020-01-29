public class ThreadPriorities extends Thread {
    @Override
    public void run() {
        System.out.println("Child Thread");
    }
}

class ThreadDemo4{
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(9);
        ThreadPriorities p = new ThreadPriorities();
        System.out.println(p.getPriority());
    }

}