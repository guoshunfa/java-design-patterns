package 工厂模式.简单工厂模式;

/**
 * @ClassName main
 * @Description 测试类
 * @Author guoshunfa
 * @Date 2021/8/2 上午8:37
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        Product iphone = Factory.buildProduct("Iphone");
        Product huawei = Factory.buildProduct("Huawei");

        System.out.println(iphone.name());
        System.out.println(huawei.name());
    }
}
