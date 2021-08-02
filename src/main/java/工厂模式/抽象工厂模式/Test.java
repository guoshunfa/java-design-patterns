package 工厂模式.抽象工厂模式;

import 工厂模式.工厂方法模式.HuaweiFactory;
import 工厂模式.工厂方法模式.IphoneFactory;
import 工厂模式.工厂方法模式.Product;

/**
 * @ClassName main
 * @Description 测试类
 * @Author guoshunfa
 * @Date 2021/8/2 上午8:37
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Product huawei = new HuaweiFactory().buildProduct();
        Product iphone = new IphoneFactory().buildProduct();

        System.out.println(iphone.name());
        System.out.println(huawei.name());
    }
}
