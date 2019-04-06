package ys.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStream {
    public static void input(){
        String str=null;
        try {
            //���ֽ���ת�����ֽ�����System.in���ֽ���
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
            str=bufferedReader.readLine();
            System.out.println("The str is :" +str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void emptyStr() throws IOException {
        String str="11111";
        System.out.println("The str is: "+str);
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        str=bufferedReader.readLine();  //���ֱ�Ӱ��س����ַ���Ϊ"",������null
        System.out.println("---------------");
        System.out.println(str.equals(null));
        System.out.println(str.equals(""));
        System.out.println("The str is :" +str);
    }
    public static void main(String[] args) throws IOException {
        //input();
        emptyStr();
    }
}
