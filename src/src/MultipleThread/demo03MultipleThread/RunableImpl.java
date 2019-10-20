package MultipleThread.demo03MultipleThread;

/**
 * @author : 赵静超
 * @date Date : 2019/10/20 18:23
 * @description :
 */
public class RunableImpl implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
