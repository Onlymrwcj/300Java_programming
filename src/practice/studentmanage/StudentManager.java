package practice.studentmanage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author guiqing
 * @version 1.0
 * @className StudentManager
 * @description TODO
 * @since 2021/8/11 8:02 下午
 */
public class StudentManager {
    public static void main(String[] args) {
        //创建集合对象，用于存储学生数据
        ArrayList<student> array = new ArrayList<>();

        /*
         * 1.用输出语句进行主界面的编写
         * 2.用scanner实现键盘输入
         * 3.用switch功能完成选择
         * 4.用循环完成功能结束后再次回到主界面
         * */
        while (true) {
            System.out.println("----------------欢迎来到学生管理系统----------------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3。修改学生");
            System.out.println("4。查看所有学生");
            System.out.println("5。退出");
            System.out.println("请输入你的选择：");
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            //用swith语句进行操作选择
            switch (line) {
                case "1":
                    //System.out.println("添加学生");
                    addStudent(array);
                    break;
                case "2":
                    //System.out.println("删除学生");
                    deleStudent(array);
                    break;
                case "3":
                    //System.out.println("修改学生");
                    updateStudent(array);
                    break;
                case "4":
                    //System.out.println("查看学生");
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("感谢使用");
                    System.exit(0);
                    //jvm退出
            }

        }
    }

    //添加学生
    public static void addStudent(ArrayList<student> array) {
        //键盘录入学生对象所需要的数据,显示提示信息，提示要输入何种信息
        Scanner s = new Scanner(System.in);
        String sid;

while(true) {
    System.out.println("请输入学生学号");
    sid = s.nextLine();


    boolean flag = isUsed(array, sid);
    if (flag) {
        System.out.println("你输入的学号已经被占用了，请重新输入");
    } else {
        break;
    }
}
        System.out.println("请输入学生姓名");
        String name = s.nextLine();
        System.out.println("请输入学生年龄");
        String age = s.nextLine();
        System.out.println("请输入学生居住地");
        String address = s.nextLine();


        //创建学生对象，键盘录入的数据赋值给学生对象的成员变量方法
        student s1 = new student();
        s1.setSid(sid);
        s1.setAddress(address);
        s1.setAge(age);
        s1.setName(name);

        //将学生对象添加到集合中去
        array.add(s1);


        //给出添加成功的提示
        System.out.println("添加学生成功");
    }

    //判读学号是否被占用
    public static  boolean isUsed(ArrayList<student>array,String sid){
        boolean flag=false;
        for (int i = 0; i < array.size(); i++) {
            student s=array.get(i);
            if (s.getSid().equals(sid)){
                flag=true;break;
            }
        }
        return flag;
    }

    //查询所有学生
    public static void findAllStudent(ArrayList<student> array) {
        //判断集合当中是否有数据，没有数据则提示先添加数据

        if (array.size() == 0) {
            System.out.println("无信息，请先添加信息");

            //不再执行
            return;

        }

        System.out.println("学号\t\t\t姓名\t\t\t年龄\t\t\t居住地\t\t");
        //将集合中数据按照对应的格式显示
        for (int i = 0; i < array.size(); i++) {
            student s = array.get(i);
            System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getAddress() + "\t");
        }
    }

    //删除学生信息
    public static void deleStudent(ArrayList<student> array) {
        //键盘录入要删除的学生学号,显示提示信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要删除的学生的学号:");
        String sid = sc.nextLine();

//遍历集合将对应的学生从集合中删除
        int index = -1;
        for (int i = 0; i < array.size(); i++) {
            student s = array.get(i);
            if (s.getSid().equals(sid)) {
                index = i;
                break;
            }
            if (index == -1) {
                System.out.println("信息输入不存在");
            } else {
                array.remove(index);
                System.out.println("删除学生成功！");
            }
        }


    }

    //修改学生信息
    public static void updateStudent(ArrayList<student> array) {
    //键盘录入要修改的学生学号，显示提示信息
        Scanner s = new Scanner(System.in);
        System.out.println("请输入你要修改的学生的学号");
        String sid = s.nextLine();


    //键盘录入要修改的学生信息
        System.out.println("请输入学生新姓名：");
        String name=s.nextLine();
        System.out.println("请输入学生的新年龄");
        String age=s.nextLine();
        System.out.println("请输入学生的新居住地");
        String address=s.nextLine();

        //创建一个学生对象
        student s1=new student();
        s1.setSid(sid);
        s1.setAge(age);
        s1.setAddress(address);
        s1.setName(name);

        //遍历循环修改对应的学生信息
        for (int i = 0; i < array.size(); i++) {
            student student=array.get(i);
            if (student.getSid().equals(sid)){
                array.set(i,s1);
            }
        }
        //修改成功后的提示
        System.out.println("修改学生成功");


    }

}