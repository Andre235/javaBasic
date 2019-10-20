package MultipleThread.demo08WaitAndNotify;

/**
 * @author : 赵静超
 * @date Date : 2019/10/20 21:53
 * @description :  等待唤醒案例：线程之间通信
 *                 顾客线程（消费者）：告诉老板线程要的包子种类和数量，调用wait() ，放弃CPU的执行权限，进入无限等待状态
 *                 老板线程（提供者）：告诉消费者线程您要的包子做好了，调用notify()方法，唤醒顾客吃包子
 *                 注意：
 *                      1、顾客线程和老板线程必须在同步代码块中执行，保证等待和唤醒状态不能同时存在
 *                      2、同步使用的锁对象必须唯一
 *                      3、必须使用锁对象来调用wait()和notify()方法
 */
public class Test {
    public static void main(String[] args) {
        //创建锁对象，保证
        Object obj = new Object();
        //创建顾客线程（消费者）
        new Thread(() -> {
            //创建同步代码块，保证等待和唤醒状态的唯一性
            synchronized (obj){
                System.out.println("老板，我要两个豆沙包");
                try {
                    obj.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //提供者线程唤醒之后，调用的方法
                System.out.println("好的，钱已经转过去了");
            }
        }).start();

        //创建老板线程（提供者）
        new Thread(){
            @Override
            public void run() {
                //花费5秒钟做包子
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //创建同步代码块，保证等待和唤醒状态的唯一性
                synchronized (obj){
                    System.out.println("好的，包子马上就做好了");
                    obj.notify();
                }
            }
        }.start();
    }
}
