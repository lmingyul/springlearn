package commonmethod;

/**
 * 剑
 * @author liangtaiming
 * @date 2022/10/16
 **/
public class Sword {

    /**
     * 攻击力
     */
    private String firePower;

    /**
     * 空参构造
     */
    public Sword() {
    }

    /**
     * 有参构造
     */
    public Sword(String firePower) {
        this.firePower = firePower;
    }

    /**
     * 攻击敌人方法
     */
    public void attackEnemy(String enemyName) {
        System.out.println("Sword can damage enemy " + enemyName + " " + this.firePower + " life");
    }
}

