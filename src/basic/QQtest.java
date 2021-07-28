package basic;

import java.util.Scanner;

/**
 * @author guiqing
 * @version 1.0
 * @className QQtest
 * @description qq等级活跃天数计算器
 * @since 2021/7/28 9:33 下午
 */
public class QQtest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你的QQ等级");
        int i=scanner.nextInt();
        //对于qq等级的判定
        if (i==1)
            System.out.println("您的活跃天数为5天");
        else if (i==4)
            System.out.println("您的活跃天数为32天");
        else if (i==8)
            System.out.println("您的活跃天数为96天");
        else if (i==12)
            System.out.println("您的活跃天数为192天");
        else if(i==16)
            System.out.println("您的活跃天数为320天");
        else if(i==32)
            System.out.println("您的活跃天数为1152天");
        else if (i==48)
            System.out.println("您的活跃天数为2496天");
        else if (i==64)
            System.out.println("您的活跃天数为4352天");
        else
             System.out.println("您的活跃天数暂时未知");
    }
}
