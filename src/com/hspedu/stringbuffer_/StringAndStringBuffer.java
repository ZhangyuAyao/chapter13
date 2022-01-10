package com.hspedu.stringbuffer_;

public class StringAndStringBuffer {
    public static void main(String[] args) {
        String str = "hello tom";
        StringBuffer stringBuffer = new StringBuffer(str);

        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1 = stringBuffer1.append(str);

        //看看 StringBuffer -> String
        StringBuffer stringBuffer3 = new StringBuffer("韩顺平教育");
        String s = stringBuffer3.toString();
        //使用构造器来搞定
        String s1 = new String(stringBuffer3);
    }
}
