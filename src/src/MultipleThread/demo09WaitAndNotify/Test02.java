package MultipleThread.demo09WaitAndNotify;

/**
 * @author : 赵静超
 * @date Date : 2019/10/21 6:47
 * @description :  计时等待：
 *                      在wait(5000)方法内传入参数，如果在给定时间内还没有被唤醒，则自动唤醒
 */
public class Test02 {
    public static void main(String[] args) {
        //创建锁对象，保证
        Object obj = new Object();
        //创建顾客线程1（消费者）
        new Thread(() -> {
            while(true){
                //创建同步代码块，保证等待和唤醒状态的唯一性
                synchronized (obj){
                    System.out.println("顾客1：老板，我要两个豆沙包");
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //提供者线程唤醒之后，调用的方法
                    System.out.println("顾客1：开始吃包子了");
                    System.out.println("-------------------------");
                }
            }
        }).start();

        //创建顾客线程2（消费者）
        new Thread(() -> {
            while(true){
                //创建同步代码块，保证等待和唤醒状态的唯一性
                synchronized (obj){
                    System.out.println("顾客2：老板，我要两个豆沙包");
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //提供者线程唤醒之后，调用的方法
                    System.out.println("顾客2开始吃包子了");
                    System.out.println("-------------------------");
                }
            }
        }).start();

        //创建老板线程（提供者）
        new Thread(){
            @Override
            public void run() {
                while(true){
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
                        //obj.notifyAll();
                    }
                }
            }
        }.start();
    }
}
