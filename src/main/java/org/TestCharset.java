package org;


import java.nio.charset.Charset;

public class TestCharset {
    public static void main(String[] args) {
        // 中文"好" 的gbk编码为两个字节，即两个byte，也就是4个16进制来表示： 0xBA 0xC3

        byte[] bytes = new byte[]{(byte)0xBA,(byte)0xC3};//gbk的“好”
        String hao = new String(bytes,Charset.forName("gbk"));
        String hao_gbk = new String(bytes, Charset.forName("GBK"));
        String hao_utf8 = new String(bytes, Charset.forName("utf-8"));
        String hao_iso = new String(bytes, Charset.forName("ISO-8859-1"));
        System.out.println(hao_gbk);
        System.out.println(hao_utf8);
        System.out.println(hao_iso);


        String nihao = "你好";
        nihao.toCharArray();


    }
}
