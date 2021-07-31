package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author guiqing
 * @version 1.0
 * @className MatrixTrace
 * @description 矩阵的主对角线之和
 * @since 2021/7/31 5:13 下午
 */
public class MatrixTrace {
    public static void main(String[] args) throws IOException {
        int n = 0;
        System.out.println("请输入矩阵的维数和数组内容：");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        String[] s = new String[n];
        Scanner[] scan = new Scanner[n];
        long[][] a = new long[n][n];

        long sum=0;
//
        BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i <n; i++) {
            //连续输入多行
            s[i]= stdin.readLine();

        }
        System.out.println("您输入的矩阵为：");
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j]=scan[i].nextLong();
            }
        }
        //获取矩阵对角线上的元素的值
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.println(a[i][j]+" ");
                if (i==j){
                    sum+=a[i][j];
                }
            }
            System.out.println("");

        }
        System.out.println("矩阵的迹为"+sum);
    }
}
