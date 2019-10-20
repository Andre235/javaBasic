package MultipleThread.demo02MultipleThread;

/**
 * @author : 赵静超
 * @date Date : 2019/10/20 17:08
 * @description : 继承Thread类，创建多线程任务
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        /*for (int i = 0; i < 7; i++) {
            System.out.println("线程"+i);
        }*/
        /*String name = getName();
        System.out.println(name);*/
        System.out.println(Thread.currentThread().getName());
    }
}
