package simplefactory;

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
        // 通过调用工厂类 WeaponFactory 创建出不同的武器类，并调用不同武器的方法
        Weapon weapon = WeaponFactory.createWeapon(enemy);
        weapon.attackEnemy(enemy);
    }
}
