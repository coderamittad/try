package threwa;

public class starting {
    public static void main(String[] args) throws InterruptedException {
        myTHread t = new myTHread();
        Thread thread = new Thread(t);
        thread.start();
        dadagiri d=new dadagiri();
        Thread thrd =new Thread(d);
        thrd.start();

    }
}
