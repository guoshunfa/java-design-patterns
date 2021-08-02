package 工厂模式.抽象工厂模式;

/**
 * @ClassName HuaweiFactory
 * @Description 华为工厂
 * @Author guoshunfa
 * @Date 2021/8/2 上午8:52
 * @Version 1.0
 **/
public class HuaweiFactory extends Factory {
    Product buildProduct() {
        return new Huawei();
    }
}
