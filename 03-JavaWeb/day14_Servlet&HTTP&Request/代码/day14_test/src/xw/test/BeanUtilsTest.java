package xw.test;

import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;
import xw.domain.User;

import java.lang.reflect.InvocationTargetException;

public class BeanUtilsTest {

    @Test
    public void test() {
        User user = new User();
        try {
            // setProperty方法操作的是User类的属性，而不是成员变量
            BeanUtils.setProperty(user, "hehe", "male");
            System.out.println(user);

            String gender = BeanUtils.getProperty(user, "hehe");
            System.out.println(gender);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
