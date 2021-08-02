package 单例模式.懒汉式;

/**
 * @ClassName Single
 * @Description 懒汉式
 * @Author guoshunfa
 * @Date 2021/8/2 下午9:31
 * @Version 1.0
 **/
public class Single {

    private Single() {};

    private static Single single;

    public static Single newInstance(){
        if (null == single) {
            synchronized (Single.class) {
                if (single == null) {//2
                    single = new Single();
                }
            }
        }
        return single;
    }

}
