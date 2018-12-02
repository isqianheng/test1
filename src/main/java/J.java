import javassist.bytecode.ByteArray;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

public class J {
    public static void main(String[] args) {

//        String 字符串 ="字符串";
//        System.out.println(字符串);

        String s = new String("你好".getBytes(Charset.forName("utf-8")),Charset.forName("utf-8"));

        byte[] bytes = new byte[]{(byte)0xBA,(byte)0xC3};//gbk的“好”
        String hao = new String(bytes,Charset.forName("gbk"));
//        System.out.println(hao);
//        byte[] bytes2 = hao.getBytes(Charset.forName("utf-8"));
//
//        FileOutputStream o = null;
//        try {
//            o = new FileOutputStream(new File("e:/tmp/t.txt"));
//            o.write(bytes2);
//            o.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        System.out.println(new String(bytes,Charset.forName("GBK")));
        System.out.println(bytes.length);
        StringBuilder sb = new StringBuilder();
        for (byte b:bytes) {
            String sh = Integer.toHexString(b);
            System.out.println(sh+"|"+b);
            sb.append(sh);
        }
        System.out.println(sb);


//        byte[] b1 = s.getBytes(Charset.defaultCharset());
//        byte[] b2 = s.getBytes(Charset.forName("utf-8"));
//        byte[] b3 = s.getBytes(Charset.forName("gbk"));
//        byte[] b4 = s.getBytes(Charset.forName("ISO8859-1"));
//
//        char[] chars = new char[3];
//        chars[0] ='a';
//        chars[1] ='b';
//        chars[2] ='c';
//        System.out.println(new String(chars));

//        System.out.println(b1.length);
//        System.out.println(b2.length);
//        System.out.println(b3.length);
//        System.out.println(b4.length);
//
//
//
//        System.out.println(Byte.toString((byte)127));
//        System.out.println(Integer.toHexString((byte)123));
//
//
//        String[] sa = {"1","2"};
//        Arrays.asList(sa);
//        System.out.println(Integer.toBinaryString(110));
//        System.out.println(Integer.toOctalString(9));
//
//
//
//        System.out.println(s);
//        System.out.println(new String(s.getBytes(Charset.forName("gbk")), Charset.forName("gbk")));
//
//        FileWriter fw = null;
//        try {
//              fw =   new FileWriter(new File("E:/tmp/log.txt"));
//              fw.write(new String(s.getBytes(Charset.forName("utf-8")), Charset.forName("utf-8")));
//              fw.flush();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }
}
