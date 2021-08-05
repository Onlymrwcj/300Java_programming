package basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author guiqing
 * @version 1.0
 * @className phoneEncryption
 * @description T
 * @since 2021/8/5 9:13 下午
 */

/*
* 某公司采用公用电话，在传递过程中是加密的，
* 加密规则如下：每位数字都加上5
* 然后用和除于10的余数代替该数字
* 再将第一位数和第四位数进行交换
* 第二位和第三位数交换
* */
public class phoneEncryption {
    public static void main(String[] args)throws  Exception {
        System.out.println("请输入你要加密的数字");

        BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));

        String s=stdin.readLine();

        char[]a=s.toCharArray();
        int[]b=new int[a.length];
        for (int i = 0; i < a.length; i++) {

            //
            b[i]=((a[i]-'0')+5)%10;


        }
        System.out.println("加密后的数字是：");
        for (int i = 0; i < b.length-1; i++) {
            System.out.print(b[i]);
        }
    }



}
