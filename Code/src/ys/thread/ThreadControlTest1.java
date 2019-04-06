package ys.thread;

public class ThreadControlTest1 implements Runnable {
    private int percent;
    private boolean RUN;
    public void run() {
        while (RUN){
            System.out.println("rate of progress: "+percent);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            percent+=10;
            if(percent==100){
                System.out.println("finished");
                break;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadControlTest1 test1 = new ThreadControlTest1();
        Thread thread = new Thread(test1);
        thread.start();

        //Thread.sleep(5000);
        test1.RUN=false;
        System.out.println("pause for 5 seconds...");
        Thread.sleep(5000);
        test1.RUN=true;
        thread=new Thread(test1);
        thread.start();

    }
}
