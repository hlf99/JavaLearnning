package xw.day09.demo02;

public class Son extends Father {

    int numSon = 20;

    int num = 200;

    public void methodSon() {
        // 因为本类当中有num，所以这里使用的是本类当中的num，如果本类中没有num，才会去父类中找
        System.out.println(num);
    }
}
