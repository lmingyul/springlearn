package setterinjection;

import lombok.AllArgsConstructor;
import lombok.Data;
import simplefactory.WeaponFactory;

/**
 * 人
 * @author liangtaiming
 */
@Data
public class Person {

    private Weapon weapon;

    /**
     * 属性注入的setter方法
     * @param weapon 注入的对象
     */
    public void setWeapon(Weapon weapon)
    {
        this.weapon = weapon;
    }

    public void attack(String enemy){
        // 调用依赖对象 weapon 的 attackEnemy(）方法
        weapon.attackEnemy(enemy);
    }
}
