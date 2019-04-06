package ys.string;

public class China_count {
    void checkCount(StringBuffer str){
        int i=0;
        int count=0;
        while (i<str.length()){
            if(str.substring(0,2).equals("中国")){
                count++;
                i+=2;
                str.delete(0,2);
            }else{
                i+=1;
                str.delete(0,1);
            }
        }
        System.out.println("该字符串中含有‘中国’的个数为："+count);
    }

    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("中国当时的你身中边的男中国生是否会吊死扶伤放松和地方");

        China_count china_count = new China_count();
        china_count.checkCount(str);
    }
}
