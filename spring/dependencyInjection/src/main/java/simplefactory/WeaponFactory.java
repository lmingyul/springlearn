package simplefactory;

/**
 * 武器工厂类
 *
 * @author liangtaiming
 * @date 2022/10/17
 **/
public class WeaponFactory {
    public static Weapon createWeapon(String type) {
        if ("small".equals(type)) {
            return new Sword("50");
        } else if ("big".equals(type)) {
            return new Gun("1000");
        } else {
            throw new RuntimeException("无法创建合适的武器类型");
        }
    }
}
