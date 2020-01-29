class RunOverloading extends Thread {
    public void run()
    {
        System.out.println("No args method");
    }
    public void run(int i)
    {
        System.out.println("args method");
    }
}

class Test{
    public static void main(String[] args) {
        RunOverloading obj = new RunOverloading();
        obj.start();
    }
}