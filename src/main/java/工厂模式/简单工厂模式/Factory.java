package 工厂模式.简单工厂模式;

import cn.hutool.core.util.StrUtil;

/**
 * @ClassName Factory
 * @Description 工厂
 * @Author guoshunfa
 * @Date 2021/8/2 上午8:29
 * @Version 1.0
 **/
public class Factory {

    public static Product buildProduct(String productName) {
        if (StrUtil.isBlank(productName)) throw new RuntimeException("参数productName值为空。");

        if (productName.equals("Iphone")) {
            return new Iphone();
        } else if (productName.equals("Huawei")) {
            return new Huawei();
        }
        return null;
    }

}
