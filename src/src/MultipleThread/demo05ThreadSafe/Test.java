package MultipleThread.demo05ThreadSafe;

/**
 * @author : 赵静超
 * @date Date : 2019/10/20 19:46
 * @description : 模拟买票案例，创建三个线程，同时对共享数据进行操作
 */
public class Test {
    public static void main(String[] args) {
        ThreadSafe thread = new ThreadSafe();
        Thread t0 = new Thread(thread);
        Thread t1 = new Thread(thread);
        Thread t2 = new Thread(thread);
        t0.start();
        t1.start();
        t2.start();

    }
}
