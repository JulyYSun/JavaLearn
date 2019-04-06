package ys.string;

public class Search_str {
    void Count(StringBuffer str,String subStr){
        int i=0;
        int count=0;
        int strLen=str.length();
        int subStr_len=subStr.length();
        String str_Origin=str.toString();
        while (i<strLen){
            if(str.substring(0,subStr_len).equals(subStr)){
                count++;
                i+=subStr_len;
                str.delete(0,subStr_len);
            }else{
                i+=1;
                str.delete(0,1);
            }
        }
        System.out.println(str_Origin+"中含有"+subStr+"的个数为"+count);
    }

    public static void main(String[] args) {
        Search_str search_str = new Search_str();
        StringBuffer stringBuffer=new StringBuffer("ababaaaabbbbabbbabaaaabbbabbnnababab");
        String subStr="ab";
        search_str.Count(stringBuffer,subStr);
    }
}
