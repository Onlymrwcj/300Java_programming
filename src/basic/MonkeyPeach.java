package basic;

/**
 * @author guiqing
 * @version 1.0
 * @className Monkey
 * @description TODO
 * @since 2021/7/30 9:58 下午
 */

/*
* 五个猴子分桃：
* 第一只猴子把这堆桃子分成了五份，多了一个，将多余的桃子扔到海里
* 第二只猴子把剩下的桃子又平均分成五份，又多了一个，同样扔到海里
* 第三只、第四只、第五只同样如此，问海滩上原来最少有多少桃子，此时的五只猴子得到多少个桃子*/
public class MonkeyPeach {
    public static void main(String[] args) {
        int n=1;
        int m=0;
        int flag=1;
        int monkeyNum=5;
        while (true){
            flag=1;
            m=monkeyNum*n+1;
            for (int i = monkeyNum; i >=1 ; i--) {
                if (m%(monkeyNum-1)==0){
                    m=m/(monkeyNum-1)*monkeyNum+1;
                    flag++;
                }
                else
                    break;;

            }
            if (flag==monkeyNum)
                break;
            n++;
        }
        System.out.println("开始的桃子数至少是"+m);
        System.out.println("此时第五只猴子得到的桃子数为"+n);
    }
}
