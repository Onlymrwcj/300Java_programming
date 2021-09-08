package practice.stream;

import java.io.*;

/**
 * @author GuiQing
 * @version 1.0
 * @className conversionstreamdemo
 * @description 字符流中的编码解码问题
 * @since 2021/9/8 10:25 下午
 */
public class conversionstreamdemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr=new InputStreamReader(new FileInputStream("src/practice/stream/小说.txt"),"GBK");


        //一次读取一个字符数据
        int ch;
        while ((ch = isr.read()) != -1) {
            System.out.print((char) ch);
        }
        isr.close();
    }
}
