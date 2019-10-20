package MultipleThread.demo09WaitAndNotify;

/**
 * @author : 赵静超
 * @date Date : 2019/10/21 6:47
 * @description :  计时等待：
 *                      在wait(5000)方法内传入参数，如果在给定时间内还没有被唤醒，则自动唤醒
 */
public class Test {
    public static void main(String[] args) {
        //创建锁对象，保证
        Object obj = new Object();
        //创建顾客线程（消费者）
        new Thread(() -> {
            while(true){
                //创建同步代码块，保证等待和唤醒状态的唯一性
                synchronized (obj){
                    System.out.println("老板，我要两个豆沙包");
                    try {
                        obj.wait(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //提供者线程唤醒之后，调用的方法
                    System.out.println("好的，钱已经转过去了");
                    System.out.println("-------------------------");
                }
            }

        }).start();

    }
}
