package tech.mingyu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liangtaiming
 * @date 2022/10/30
 **/
public class Test {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("----- init BeanFactory -----");

        Car car = applicationContext.getBean("car", Car.class);
        System.out.println("----- car bean is ready for use -----");
        car.drive();
    }

}
