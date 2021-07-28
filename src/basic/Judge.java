package basic;

import java.util.Scanner;

/**
 * @author guiqing
 * @version 1.0
 * @className Judge
 * @description 判断某一年是否为闰年
 * @since 2021/7/28 9:13 下午
 */

/*
* 判断一个闰年的条件：
* 1.一个数能被4整除但不能被100整除
* 2.能被400整除*/
public class Judge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个年份");
        long years;

        try {
            years = scan.nextLong();
            if (years % 4 == 0 && years % 100 != 0 ||years%400==0 ) {
                System.out.println(years+"是闰年");
            }
            else{
                System.out.println(years+"不是闰年");
            }
        } catch (Exception e) {
            System.out.println("你输入的不是有效年份！");
        }

    }
}
