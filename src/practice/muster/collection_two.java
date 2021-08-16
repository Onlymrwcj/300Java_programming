package practice.muster;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author guiqing
 * @version 1.0
 * @className collection_two
 * @description TODO
 * @since 2021/8/15 8:53 下午
 */
public class collection_two {
    public static void main(String[] args) {
        Collection<Student> students=new ArrayList<>();

        //创建学生对象
        Student s1 = new Student("林青霞", 30);
        Student s2 = new Student("张曼玉", 35);
        Student s3 = new Student("王祖贤", 33);

        //将对象添加进集合当中
        students.add(s1);
        students.add(s2);
        students.add(s3);

        //迭代器遍历
        Iterator<Student> s=students.iterator();

        while(s.hasNext()){
            Student s4=s.next();
            System.out.println(s4.getName()+","+s4.getAge());
        }
    }
}
