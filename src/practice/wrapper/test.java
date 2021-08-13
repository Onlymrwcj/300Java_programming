package practice.wrapper;

/**
 * @author guiqing
 * @version 1.0
 * @className test
 * @description TODO
 * @since 2021/8/13 9:42 下午
 */
public class test {
    public static void main(String[] args) {
        Integer i1=new  Integer(100);
        System.out.println(i1);

        Integer i2=new Integer("100");
        System.out.println(i2);

        Integer i3=Integer.valueOf(100);
        System.out.println(i3);

        Integer i4=Integer.valueOf("123");
        System.out.println(i4);
    }
}
