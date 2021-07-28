package basic;

import java.util.Scanner;

/**
 * @author guiqing
 * @version 1.0
 * @className CheckLogin
 * @description 通过简单的if-else 语句进行用户登陆信息的验证
 * @since 2021/7/28 9:26 下午
 */
public class CheckLogin {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入登陆用户名：");
        String username= scanner.nextLine();
        System.out.println("请输入登陆密码:");
        String password=scanner.nextLine();
        //判断用户名合法性
        if(!username.equals("lester")){
            System.out.println("用户名输入非法！");
        }
        else if (!password.equals("123456")){
            System.out.println("用户密码不正确");
        }
        else{
            System.out.println("恭喜你，认证成功");
        }
    }
}
