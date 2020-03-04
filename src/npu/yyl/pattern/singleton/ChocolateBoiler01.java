package npu.yyl.pattern.singleton;

/**
 * 巧克力工厂的单例模式
 */
public class ChocolateBoiler01 {

    private boolean empty;
    private boolean boiled;

    private static ChocolateBoiler01 uniqueInstance;

    private ChocolateBoiler01() {
        this.empty = true;
        this.boiled = false;
    }

    public static ChocolateBoiler01 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ChocolateBoiler01();
        }
        return uniqueInstance;
    }

    public void fill() {
        if (empty) {
            empty = false;
            boiled = false;
            // 用牛奶、巧克力混合物填充锅炉
        }
    }

    /***
     * 剩余的ChocolateBoiler代码略
     */
}
