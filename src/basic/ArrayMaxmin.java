package basic;

import java.util.Scanner;

/**
 * @author guiqing
 * @version 1.0
 * @className ArrayMaxmin
 * @description 获取一维数组中的最大最小值
 * @since 2021/7/31 4:58 下午
 */
public class ArrayMaxmin {
    public static void main(String[] args) {

        int max, min;
        int[] A = {25, 65, 98, 35, 45};
        //最大最小值初始化为数组第一位
        min = max = A[0];
        System.out.println("数组A的元素有：");
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i] + " ");
            //判断最大值
            if (A[i] > max) {
                max = A[i];
            }
            //判断最大值
            if (A[i] < min) {
                min = A[i];
            }

        }
        System.out.println("数组的最大值为" + max);
        System.out.println("数组最小值为" + min);
    }
}
