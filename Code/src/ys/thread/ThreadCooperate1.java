package ys.thread;

public class ThreadCooperate1 {
    private long sum;
    class CalThread extends Thread{
        @Override
        public void run() {
            for(int i=0;i<100000;i++){
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
    public void work(){
        CalThread calThread = new CalThread();
        SaveThread saveThread = new SaveThread();
        calThread.start();
        saveThread.start();
    }

    public static void main(String[] args) {
        new ThreadCooperate1().work();
    }
}
