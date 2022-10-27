package commonmethod;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 人
 * @author liangtaiming
 */
@AllArgsConstructor
@Data
public class Person {

    public void attack(String enemy){
        Sword sword = new Sword("50");
        sword.attackEnemy(enemy);
    }

}
