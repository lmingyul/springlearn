package tech.mingyu;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author liangtaiming
 * @date 2022/11/23
 **/
@NoArgsConstructor
@Data
public class Animal {

    private String gender;

    public void eat() {
        System.out.println("Animal is eating something!");
    }
}
