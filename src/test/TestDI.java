package test;

import bean.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @description
 * @author: yanghz
 * @create: 2019-06-09 15:08
 **/
public class TestDI {

    @Test
    public void testDIUser(){
        // create and configure beans
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // retrieve configured instance
        User user = context.getBean("user", User.class);
        // use configured instance
        System.out.println(user);
    }
}
