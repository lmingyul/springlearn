package setterinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author liangtaiming
 * @date 2022/10/09
 **/
public class Test {

    public static void main(String[] args) {
        // 创建Spring容器
        try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml")){
            // 获取person实例
            Person person = ctx.getBean("person", Person.class);
            // 调用attack()方法
            person.attack("Boss");
        }
    }
}
