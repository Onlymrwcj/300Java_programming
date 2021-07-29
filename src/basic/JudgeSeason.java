package basic;

import java.util.Scanner;

/**
 * @author guiqing
 * @version 1.0
 * @className JudgeSeason
 * @description 判断用户输入月份的季节
 * @since 2021/7/28 9:41 下午
 */
public class JudgeSeason {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入月份:");
        int month=scanner.nextInt();
        switch(month){
            case 12:
            case 1:
            case 2:
                System.out.println("您输入的月份属于冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("您输入的月份属于春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("您输入的月份属于夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("您输入的月份属于秋季");
            break;
            default:
                System.out.println("您输入的有误");

        }

    }
}
