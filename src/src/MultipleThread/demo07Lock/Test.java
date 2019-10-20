package MultipleThread.demo07Lock;


/**
 * @author : 赵静超
 * @date Date : 2019/10/20 19:46
 * @description : 模拟买票案例，利用同步代码块解决线程安全问题
 *                原理：利用锁对象，把同步代码块锁住只让一个线程访问共享数据
 */
@SuppressWarnings("all")
public class Test {
    public static void main(String[] args) {
        ThreadSafe threadSafe = new ThreadSafe();
        Thread thread0 = new Thread(threadSafe);
        Thread thread1 = new Thread(threadSafe);
        Thread thread2 = new Thread(threadSafe);
        thread0.start();
        thread1.start();
        thread2.start();

    }
}
