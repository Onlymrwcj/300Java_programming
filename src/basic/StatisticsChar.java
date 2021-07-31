package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * @author guiqing
 * @version 1.0
 * @className StatisticsChar
 * @description 统计出数组中各种字符的个数
 * @since 2021/7/31 5:46 下午
 */
public class StatisticsChar {
    public static void main(String[] args)throws IOException {
        //创建一个s存储字符串
        String s=new String("");

        //行字数
        int h_num=0;

        //字母个数
        int z_num=0;

        //空格数
        int k_num=0;

        //数字
        int num=0;

        //其他
        int other=0;

        System.out.println("请输入一行字符：");
//BufferedReader从字符输入流中读取文本，缓冲各个字符，从而实现字符、数组和行的高效读取。
        BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));

        s=stdin.readLine();

        byte    []bytes=s.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            if (bytes[i]>=65&&bytes[i]<=90||(bytes[i]<=122&&bytes[i]>=97))
                z_num++;
            else if (bytes[i]==32)
                k_num++;
            else  if (bytes[i]>=48&&bytes[i]<=57)
                num++;
            else if (bytes[i]<0)
                h_num++;
            else
                other++;
        }
        System.out.println("字符串所占用字节个数为"+bytes.length);
        System.out.println("汉字个数"+h_num/2);
        System.out.println("英文字母个数为"+z_num);
        System.out.println("空格数字为"+k_num);
        System.out.println("数字个数为"+num);
        System.out.println("其他字符个数为"+other);
    }
}
