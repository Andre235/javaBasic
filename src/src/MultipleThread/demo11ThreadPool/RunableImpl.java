package MultipleThread.demo11ThreadPool;

/**
 * @author : 赵静超
 * @date Date : 2019/10/21 23:18
 * @description :
 */
public class RunableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
