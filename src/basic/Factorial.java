package basic;

import java.math.BigDecimal;

/**
 * @author guiqing
 * @version 1.0
 * @className Factorial
 * @description 对于阶乘的运算
 * @since 2021/7/28 9:52 下午
 */
public class Factorial {
    public static void main(String args[]){
        BigDecimal sum=new BigDecimal(0.0);
       //阶乘项计算结果
        BigDecimal factorial=new BigDecimal(1.0);
        //循环增量
        int i=1;
        while(i<=10){
            sum=sum.add(factorial);
            ++i;
            //计算阶乘项
            factorial=factorial.multiply(new BigDecimal(1.0/i));
        }
        System.out.println("1+1/2!+1/3!+1/4!+1/5!+....."+sum);

    }
}
