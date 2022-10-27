package simplefactory;

/**
 * 武器接口
 * @author liangtaiming
 * @date 2022/10/16
 **/
public interface Weapon {

    /**
     * 攻击敌人方法
     * @param enemyName 敌人名称
     */
    public void attackEnemy(String enemyName);
}