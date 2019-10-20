package MultipleThread.demo01SingleThread;

/**
 * @author : 赵静超
 * @date Date : 2019/10/20 16:48
 * @description : 主线程:执行main()方法的线程叫做主线程
 *                单线程运行时，main()从上到下顺序执行
 */
public class Demo01Thread {
    public static void main(String[] args) {
        Person person1 = new Person("Andre");
        person1.run();

        Person person2 = new Person("Natasha");
        person2.run();

    }
}
