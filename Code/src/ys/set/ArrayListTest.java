package ys.set;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();
        arrayList.add("C++");
        arrayList.add("Java");
        arrayList.add(2);
        arrayList.add(3.1212);

        //ɾ��Ԫ�غ��С�ı�
        System.out.println(arrayList.toString());
        System.out.println(arrayList.size());
        arrayList.remove(0);
        System.out.println(arrayList.size());
        System.out.println(arrayList.toString());

        //�趨ָ��λ�õ�Ԫ��
        arrayList.set(0,"Computer");
        System.out.println(arrayList.toString());


    }
}
