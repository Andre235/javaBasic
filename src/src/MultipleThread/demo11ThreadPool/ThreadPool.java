package MultipleThread.demo11ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author : 赵静超
 * @date Date : 2019/10/21 23:10
 * @description :
 */
public class ThreadPool {
    public static void main(String[] args) {
        //使用Executors线程工厂类，提供的静态方法创建一个线程池对象
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        //submit()传递线程任务，开启线程，执行run方法
        //创建一个新的线程
        executorService.submit(new RunableImpl());
        //线程使用完毕后归还线程池，可以后续继续使用
        executorService.submit(new RunableImpl());
        executorService.submit(new RunableImpl());
        executorService.submit(new RunableImpl());
        executorService.submit(new RunableImpl());

    }

}
