package com.hspedu.stringbuffer_;

public class StringBufferMethod {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("hello");
        //增加
        s.append(',');
        s.append("张三丰");
        s.append("赵敏").append(100).append(true).append(10.5);//输出：hello,张三丰周芷若22true10.5
        System.out.println(s);

        //删除
        //删除索引为 >=start && <end 处的字符
        //删除[11,14)的字符
        s.delete(11, 14);
        System.out.println(s);

        //改
        //替换[9,11)，如果替换的字符比（11-9）长，则索引11以及之后的字符往后移
        s.replace(9,11,"周芷若22");
        System.out.println(s);

        //查
        // 返回第一个字符（"张"）的索引
        int indexOf = s.indexOf("张三丰");
        System.out.println(indexOf);

        //插
        //插入索引为9的位置，索引位置9以及之后的字符往后移
        s.insert(9, "赵敏");
        System.out.println(s);

        //长度
        System.out.println(s.length());
        System.out.println(s);
    }
}

