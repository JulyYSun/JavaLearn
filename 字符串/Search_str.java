
public class Search_str {
    void Count(StringBuffer str,String subStr){
        int i=0;
        int count=0;
        int strLen=str.length();
        int subStr_len=subStr.length();
        String str_Origin=str.toString();
        while (i<strLen){
            //要搜索的字串的长度为subStr_len，如果总的字符串开头的subStr_len个与子字符串匹配，则子串数量加一
            //同时用于存储当前检测位置的计数i向后移动subStr_len位，即i+=subStr_len
            //父串删去开头已经匹配的子串
            //如果不匹配，检测位置向后移动一位，同时删除这一个不符的字符
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

//Sout：ababaaaabbbbabbbabaaaabbbabbnnababab中含有ab的个数为10
