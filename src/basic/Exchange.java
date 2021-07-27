package basic;

import java.util.Scanner;

/**
 * @author guiqing
 * @version 1.0
 * @className Exchange
 * @description 不用临时变量实现来实现两个变量之间的值的互换
 * @since 2021/7/27 8:48 下午
 */
public class Exchange {
    public static void main(String[] args) {
        //创建扫描器
        Scanner s=new Scanner(System.in);
        System.out.println("Please input the valuable of A ");
        //第一变量的输入
        long A =s.nextLong();
        System.out.println("Please input the valuable of B ");
        long B =s.nextLong();
        //输出交换前的两个变量的值
        System.out.println("The A value is "+A +"\nThe B value is "+B);
        System.out.println("Exchange the value ");
        //按位异或运算符"^"是双目运算符，功能是参与运算的两数各对应的二进位相异或
        //当两对应的两进位相异时，结果为1
        A=A^B;
        B=B^A;
        A=A^B;
        System.out.println("The value A is "+A +"\tThe value B is"+B);
    }
}
