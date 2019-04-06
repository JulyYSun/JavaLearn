package ys.thread;

class FileThread extends Thread{
    private String fileName;
    public FileThread(String fileName){
        this.fileName=fileName;
    }
    public void run(){
        System.out.println(fileName+" is running...");
        try {
            Thread.sleep(1000*3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(fileName+" finished");
    }
}
public class ThreadTest2 {
    public static void main(String[] args) {
        FileThread file1 = new FileThread("file1");
        FileThread file2 = new FileThread("file2");
        FileThread file3 = new FileThread("file3");
        file1.start();
        file2.start();
        file3.start();
    }

}
