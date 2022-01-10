package com.hspedu.string_;

public class StringExercise09 {
    public static void main(String[] args) {
        String a = "hello";
        String b = "Hello";

        System.out.println(a.equals(b));

        String username = "John";
        if("john".equalsIgnoreCase(username)){
            System.out.println("success");
        } else {
            System.out.println("failure");
        }

        System.out.println("韩顺平".length());

        String s1 = "wer@terwe@g";
        int index = s1.indexOf("tr");
        int index2 = s1.lastIndexOf("@");
        System.out.println("index="+index);
        System.out.println(index2);

        String name = "   hello, 张三  ";
        System.out.println(name.substring(6));
        System.out.println(name.substring(2,5));
        String nameIg = name.trim();
        System.out.println(nameIg);
        String s2 = nameIg.concat(nameIg).concat(nameIg);
        System.out.println(s2);
        s1 = s2.replace("hello", "hi");
        System.out.println(s1);
        String poem = "锄禾日当午，汗滴禾下土，谁知盘中餐，粒粒皆辛苦";
        String path = "E:\\aaa\\bbb";
        System.out.println("path="+path);
        String[] split = path.split("\\\\");

//        char[] chs = poem.toCharArray();
//        for (int i = 0; i < chs.length; i++){
//            System.out.println(chs[i]);
//        }

        String a1 = "jackab";
        String b1 = "jack";
        System.out.println(a1.compareTo(b1));
        int age = 12;
        double d = 12.344343;
        char ch = 'b';
        float fl = 12.44555f;


        String info = "string%s + int%d + char%c + doubleOrFloat%.2f";

        String info2 = String.format(info, a1, age, ch, d);
        System.out.println(info2);




    }
}
