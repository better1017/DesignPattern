package npu.yyl.pattern.singleton;

/**
 * 处理多线程：
 *      01中的经典单例遇到多线程就会创造出多于一个的实例
 *      只要把getInstance()变成同步(synchronized)方法
 *      多线程灾难就可以轻易地解决了
 */
public class Singleton02 {

    // 利用一个静态变量来记录Singleton类的唯一实例
    private static Singleton02 uniqueInstance;

    /*
        别的成员变量
     */

    // 把构造器声明为私有的，只有从Singleton类内部才可以调用构造器
    private Singleton02() {
    }

    //
    public static synchronized Singleton02 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton02();
        }
        return uniqueInstance;
    }

    /*
        别的方法实现
     */
}
