package MultipleThread.demo07Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author : 赵静超
 * @date Date : 2019/10/20 19:45
 * @description : 使用Lock接口解决同步线程安全问题
 */
public class ThreadSafe implements Runnable{

    private int ticket=100;
    //创建Lock接口的实现类ReentrantLock对象
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true){
            //调用lock方法
            lock.lock();
            if(ticket>0){
                //优化程序，提高程序安全问题出现的概率
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"正在售卖第"+ticket+"张票");
                ticket--;
            }
            //调用unlock方法
            lock.unlock();
        }
    }


}
