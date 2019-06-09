package test;

import bean.User;
import config.RootConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @description
 * @author: yanghz
 * @create: 2019-06-09 15:08
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = RootConfig.class)
public class TestDI {

    @Autowired
    private User user;

    @Test
    public void testDIUser(){
        // create and configure beans
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // retrieve configured instance
        User user = context.getBean("user", User.class);
        // use configured instance
        System.out.println(user);
    }
    @Test
    public void TestDIUser1(){
        System.out.println(user);
    }
}
