package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author guiqing
 * @version 1.0
 * @className Sequence
 * @description 使用for循环对数组进行排序
 * @since 2021/8/1 10:43 下午
 */
public class Sequence {
    public static void main(String[] args) throws IOException {
        String m=new String("");
        //创建数组a
        int []a={0,0,0};

        BufferedReader stdin =new BufferedReader(new InputStreamReader(System.in));

        System.out.println("请输入三个数（以空格隔开）");
        m= stdin.readLine();

        Scanner scan=new Scanner(m);

        for (int i = 0; i < 3; i++) {
            a[i]= scan.nextInt();
        }
        Arrays.sort(a);
        System.out.println("三个数的升序排序为");
        //输出排序后的数字顺序 System.out.println(a[i]+);
        for (int i = 0; i < 3; i++) {
            System.out.print(a[i]+" ");
        }

    }
}
