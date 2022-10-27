package simplefactory;

/**
 * 枪
 * @author liangtaiming
 * @date 2022/10/17
 **/
public class Gun implements Weapon {
    /**
     * 攻击力
     */
    private String firePower;

    /**
     * 无参构造
     */
    public Gun() {
    }

    /**
     * 有参构造
     */
    public Gun(String firePower) {
        this.firePower = firePower;
    }

    @Override
    public void attackEnemy(String enemyName) {
        System.out.println("Gun can damage enemy " + enemyName + " " + this.firePower + " life");
    }
}
