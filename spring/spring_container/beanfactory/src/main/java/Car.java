/**
 * 车
 * @author liangtaiming
 * @date 2022/10/30
 **/
public class Car {

    /**
     * 品牌
     */
    private String brand;
    /**
     * 颜色
     */
    private String color;

    /**
     * 空参构造
     */
    public Car() {
    }

    /**
     * 有参构造
     */
    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    /**
     * 开车
     */
    public void drive() {
        System.out.println("Drive the " + color + " " + brand + "'s Car." );
    }
}

