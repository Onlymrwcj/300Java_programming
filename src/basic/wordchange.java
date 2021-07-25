package basic;

import java.util.Scanner;

/**
 * @author guiqing
 * @version 1.0
 * @className wordchange
 * @description 对字母进行大小写的转换
 * @since 2021/7/25 9:49 下午
 */

/*
* 提示用户要输入转换的字母，经过转换后在控制台中输出*/
public class wordchange {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Please input the string you want to change!");
        //charAt() 方法用于返回指定索引处的字符。索引范围为从 0 到 length() - 1。
        //对于第一位数进行大小写转换
        char c=s.next().charAt(0);
        if(c>='A'&&c<='Z'){
            c+=32;
            System.out.println("这里的大写"+(char)(c-32)+"被转换成了小写字母"+c);
        }
        else if(c>='a'&&c<'z'){
            c-=32;
            System.out.println("这里的小写"+(char)(c+32)+"被转换成了"+c);
        }
        else
        {
            System.out.println("不允许这种格式的输入，请重新输入！");
        }
    }
}
