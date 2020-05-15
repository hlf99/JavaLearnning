package xw.day12.practice03;

/*
编写步骤：

        1. 定义类 Test6
        2. 定义 main方法
        3. 定义字符串遍历 str,赋值为J
        4. 使用for循环,初始化变量i = 0,如果i<5进入循环,步进表达式i++
        5. for循环内部,嵌套定义变量key ,赋值为i%3;
        6. 定义switch语句 ,表达式为key.
        7. case 为0时,str拼接字符'a'
        8. case 为2时,str拼接字符'V'
        9. 循环结束后,输出str
*/

public class Test6 {
    public static void main(String[] args) {
        // 定义字符串变量str,赋值为J
        String str = "J";
        // 使用for循环,初始化变量i = 0,如果i<5进入循环,步进表达式i++
        for (int i = 0; i < 5; i++) {
            // for循环内部,嵌套定义变量key ,赋值为i%3
            int key = i % 3;
            // 定义switch语句 ,表达式为key
            switch (key) {
                case 0:
                    str += 'a';
                    break;
                case 2:
                    str += 'V';
                    break;
            }
        }
        System.out.println(str); // JaVa
    }
}
