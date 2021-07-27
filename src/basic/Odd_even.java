package basic;

import java.util.Scanner;

/**
 * @author guiqing
 * @version 1.0
 * @className Odd_even
 * @description 判断一个数字的奇偶性
 * @since 2021/7/25 10:04 下午
 */

/*
利用三元运算符实现奇偶数的判断
 */
public class Odd_even {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("请输入一个数字");
        //读取输入的数字
        long number=s.nextLong();
        //对输入的数字进行三元判断
        String check=(number%2==0?"这个数字是偶数":"这个数字是奇数");
        System.out.println(check);
    }
}
