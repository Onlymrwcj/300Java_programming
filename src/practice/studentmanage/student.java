package practice.studentmanage;

/**
 * @author guiqing
 * @version 1.0
 * @className studeng
 * @description TODO
 * @since 2021/8/11 7:32 下午
 */
public class student {
    private  String age;
    private String sid;
    private String name;
    private String address;
    public String getAge() {
        return age;
    }

    public student(){

    }

    public student(String age,String sid,String name,String address){
        this.address=address;
        this.age=age;
        this.name=name;
        this.sid=sid;
    }
    public void setAge(String age) {
        this.age = age;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



}
