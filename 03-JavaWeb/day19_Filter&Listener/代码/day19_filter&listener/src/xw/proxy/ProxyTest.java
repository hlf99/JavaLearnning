package xw.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        // 1.创建真实对象
        Lenovo lenovo = new Lenovo();

        // 动态代理增强lenovo对象
        /*
            三个参数：
                1.类加载器： 真实对象.getClass().getClassLoader()
                2.接口数组： 真实对象.getClass().getInterfaces()  保证了代理对象和真实对象实现同一个接口
                3.处理器: new InvocationHandler() {...}  核心业务逻辑的处理
         */
        // 获取到一个代理对象proxy_lenovo，并强制转换为SaleComputer接口类型
        SaleComputer proxy_lenovo = (SaleComputer) Proxy.newProxyInstance(lenovo.getClass().getClassLoader(), lenovo.getClass().getInterfaces(), new InvocationHandler() {
            /*
                代理逻辑编写的方法：代理对象调用的所有方法都会触发该方法执行
                    参数：
                        1. proxy: 代理对象
                        2. method: 代理对象调用的方法，被封装的对象
                        3. args: 代理对象调用方法时，传递的实际参数
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
               /* System.out.println("该方法执行了...");
                System.out.println(method.getName());
                System.out.println(args[0]);*/


                // 判断是否是sale方法
                if (method.getName().equals("sale")) {
                    // 1. 增强参数
                    double money = (double) args[0];
                    money = money * 0.85;
                    System.out.println("专车接你...");
                    // 使用真实对象调用该方法
                    String obj = (String) method.invoke(lenovo, money);
                    System.out.println("免费送货...");
                    return obj + "_鼠标垫";
                } else {
                    Object obj = method.invoke(lenovo, args);
                    return obj;
                }

            }
        });

        // 2.调用方法
        String computer = proxy_lenovo.sale(8000);
        System.out.println(computer);

        // proxy_lenovo.show();
    }
}
