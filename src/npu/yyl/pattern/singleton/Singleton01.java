package npu.yyl.pattern.singleton;

/**
 * 经典的单件模式实现
 */
public class Singleton01 {

    // 利用一个静态变量来记录Singleton类的唯一实例
    private static Singleton01 uniqueInstance;

    /*
        别的成员变量
     */

    // 把构造器声明为私有的，只有从Singleton类内部才可以调用构造器
    private Singleton01() {
    }

    //
    public static Singleton01 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton01();
        }
        return uniqueInstance;
    }

    /*
        别的方法实现
     */
}
