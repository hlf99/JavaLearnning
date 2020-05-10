package xw.day11.demo02;

/*
* Java中有四种权限修饰符：
*                                       public > protected > (default) > private
*  四种应用场景：
*  同一个类 (我自己)                        YES       YES         YES         YES
*  同一个包（我邻居）                       YES       YES         YES          NO
*  不同包子类（我儿子，存在父子关系）         YES       YES         NO           NO
*  不同包非子类（陌生人，不存在父子关系）     YES        NO          NO          NO
*
*  注意事项：(default)并不是关键字“default”，而是不写权限修饰符
* */

public class Demo01Main {
}
