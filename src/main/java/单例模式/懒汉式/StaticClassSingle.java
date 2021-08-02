package 单例模式.懒汉式;

/**
 * @ClassName StaticClassSingle
 * @Description 请描述类的业务用途
 * @Author guoshunfa
 * @Date 2021/8/2 下午9:37
 * @Version 1.0
 **/
public class StaticClassSingle {

    private StaticClassSingle() {};

    private static class SingletonHolder {
        public static StaticClassSingle single = new StaticClassSingle();
    }

    public StaticClassSingle newInstance() {
        return SingletonHolder.single;
    }

}
