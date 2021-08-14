package practice.wrapper;

import java.util.Arrays;

/**
 * @author guiqing
 * @version 1.0
 * @className test2
 * @description TODO
 * @since 2021/8/13 9:49 下午
 */
//有一个字符串:“91 27 46 38 50”，请写程序实现最终输出结果是:“27 38 46 50 91”

public class test2 {
    public static void main(String[] args) {
    String s="91 27 46 38 50";
    //将字符串数字中的数据存储到一个ini类型的数组中
        //将空格去除
        String []Array=s.split(" ");
        //定义一个int数组，将string数组中的每一元素都存储懂啊int数组当中
        int[]arr=new int[Array.length];
        for (int i = 0; i < arr.length; i++) {
            //通过interger静态方法中的parseint（）进行转换
            arr[i]=Integer.parseInt(Array[i]);
        }
        //对于int数组进行排序
        Arrays.sort(arr);

        //对于排序后的int数组中的元素将其拼接成一个字符串
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i== arr.length-1){
                //最后一位时添加数组元素
                sb.append(arr[i]);
            }
            else {
                //未到最后一位时，添加数组元素并添加一个空格
                sb.append(arr[i]).append(" ");
            }
        }

        //对于Stringbuilder类进行转换成一个String类
        String result= sb.toString();
        System.out.println(result);
    }
}
