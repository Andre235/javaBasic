package MultipleThread.demo03MultipleThread;

/**
 * @author : 赵静超
 * @date Date : 2019/10/20 19:14
 * @description :
 */
public class TestThread {
    public static void main(String[] args) {
        RunableImpl runable = new RunableImpl();
        Thread thread = new Thread(runable);
        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
