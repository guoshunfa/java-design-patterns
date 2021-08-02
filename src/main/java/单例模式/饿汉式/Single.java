package 单例模式.饿汉式;

/**
 * @ClassName Single
 * @Description 饿汉式 - 静态常量方式
 * @Author guoshunfa
 * @Date 2021/8/2 下午9:27
 * @Version 1.0
 **/
public class Single {

    private Single() {};

    private static Single single = new Single();

    public static Single newInstance(){
        return single;
    }

}
