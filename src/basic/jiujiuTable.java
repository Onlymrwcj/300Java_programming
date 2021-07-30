package basic;

/**
 * @author guiqing
 * @version 1.0
 * @className jiujiuTable
 * @description TODO
 * @since 2021/7/29 10:22 下午
 */
public class jiujiuTable {
    public static void main(String[] args) {
    //控制变脸循环从1到9
        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+"*"+i+"="+j*i+"\t");
            }
            System.out.println();
        }
    }
}
