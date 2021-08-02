package 工厂模式.工厂方法模式;

/**
 * @ClassName IphoneFactory
 * @Description iphone工厂
 * @Author guoshunfa
 * @Date 2021/8/2 上午8:53
 * @Version 1.0
 **/
public class IphoneFactory extends Factory {
    public Product buildProduct() {
        return new Iphone();
    }
}
