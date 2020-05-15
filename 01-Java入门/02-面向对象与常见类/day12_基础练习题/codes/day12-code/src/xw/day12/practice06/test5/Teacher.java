package xw.day12.practice06.test5;

/*
老师类Teacher

    属性：姓名name，年龄age，讲课内容content
    成员方法：吃饭eat方法，讲课teach方法
*/

public class Teacher {
    private String name;
    private int age;
    private String content;

    public Teacher() {
    }

    public Teacher(String name, int age, String content) {
        this.name = name;
        this.age = age;
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // 吃饭eat方法
    public void eat() {
        System.out.println("年龄为"+age+"的"+name+"正在吃饭....");
    }

    // 讲课teach方法
    public void teach() {
        System.out.println("年龄为"+age+"的"+name+"正在亢奋的讲着"+content+"的知识........");
    }
}
