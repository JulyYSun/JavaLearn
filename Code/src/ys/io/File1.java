package ys.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=new FileInputStream("C:/Users/asus/Pictures/�ޱ���.png");
        FileOutputStream fileOutputStream=new FileOutputStream("./src/ys/io/copy.jpg");
        int aa;
        //���ļ��������ж�ȡÿһ���ֽڲ�д�뵽���ļ�
        aa=fileInputStream.read();
        while (aa !=-1) {
            fileOutputStream.write(aa);
            aa=fileInputStream.read();
        }
        fileOutputStream.flush();
        fileInputStream.close();
        fileOutputStream.close();
    }
}
