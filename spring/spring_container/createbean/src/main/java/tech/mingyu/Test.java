package tech.mingyu;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liangtaiming
 * @date 2022/11/20
 **/
public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//        // 通过 Bean id 获取对象
//        Cat cat = (Cat) applicationContext.getBean("beanOne");
//
//        cat.sayHello();
//
//        System.out.println("----- 分割线 -----");
//
//        // 通过 Bean 类型获取对象
//        Cat cat2 = applicationContext.getBean(Cat.class);
//
//        cat2.sayHello();

//        // 同时通过 Bean id 与 类型获取对象
//        Cat cat = applicationContext.getBean("beanTwo", Cat.class);
//        cat.sayHello();

        // 通过父类获取 Bean
        Animal animal = applicationContext.getBean(Animal.class);
        animal.eat();
    }
}
