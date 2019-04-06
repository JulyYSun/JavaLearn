package ys.thread;

import java.lang.reflect.Field;

public class ThreadTest1 {
    private String fileName;
    public ThreadTest1(String fileName) throws InterruptedException {
        this.fileName=fileName;
        System.out.println(fileName+" is running...");
        Thread.sleep(1000*3);
        System.out.println(fileName+" finished");
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadTest1 file1 = new ThreadTest1("file1");
        ThreadTest1 file2 = new ThreadTest1("file2");
        ThreadTest1 file3 = new ThreadTest1("file3");
    }
}
