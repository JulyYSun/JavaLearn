package ys.thread;

public class ThreadCooperate2 {
    private long sum;
    class CalThread extends Thread{
        @Override
        public void run() {
            for(int i=0;i<=100000;i++){
                sum+=i;
            }
            System.out.println("cal finished!");
        }
    }
    class SaveThread extends Thread{
        @Override
        public void run() {
            System.out.println("data saved successfully! sum= "+sum);
        }
    }
    public void work() throws InterruptedException {
        CalThread calThread = new CalThread();
        SaveThread saveThread = new SaveThread();
        calThread.start();
        calThread.join();
        //在计算线程没结束时，不会执行存储线程
        saveThread.start();
    }

    public static void main(String[] args) throws InterruptedException {
        new ThreadCooperate2().work();
    }
}
