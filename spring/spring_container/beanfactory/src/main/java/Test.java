import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * @author liangtaiming
 * @date 2022/10/30
 **/
public class Test {
    public static void main(String[] args) {
        // 搜索类加载路径下的 beans.xml 文件创建 Resource 对象
        ClassPathResource classPathResource = new ClassPathResource("beans.xml");
        // 创建出默认的 BeanFactory 容器
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 让默认的 BeanFactory 容器加载 classPathResource 对应的 XML 配置文件
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(classPathResource);
        System.out.println("----- init BeanFactory -----");

        Car car = beanFactory.getBean("car", Car.class);
        System.out.println("----- car bean is ready for use -----");
        car.drive();
    }
}
