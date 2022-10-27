package simplefactory;

/**
 * @author liangtaiming
 * @date 2022/10/09
 **/
public class Test {

    public static void main(String[] args) {
        String enemyType1 = "big";
        String enemyType2 = "small";
        Person person = new Person();
        person.attack(enemyType1);
        person.attack(enemyType2);
    }
}
