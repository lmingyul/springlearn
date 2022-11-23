package tech.mingyu;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liangtaiming
 * @date 2022/11/20
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Cat {

    private String name;

    private String age;

    public void sayHello() {
        System.out.println("The " + name + " Cat is " + age + " years old!");
    }
}
