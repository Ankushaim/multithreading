class StartOverloading extends Thread {
    public void start()
    {
        super.start();
        System.out.println("Start method");
    }
    public void run()
    {
        System.out.println("Run method");
    }
}
class Test1{
    public static void main(String[] args) {
        StartOverloading obj = new StartOverloading();
        obj.start();
        System.out.println("Main Method");
        //obj.start();//illegal thread exception
    }
}