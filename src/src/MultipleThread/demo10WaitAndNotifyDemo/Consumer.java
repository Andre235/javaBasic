package MultipleThread.demo10WaitAndNotifyDemo;

/**
 * @author : 赵静超
 * @date Date : 2019/10/21 22:37
 * @description : 消费者吃货线程
 */

public class Consumer extends Thread {

    public Baozi baozi;

    public Consumer(Baozi baozi) {
        this.baozi = baozi;
    }

    @Override
    public void run() {
        while (true){
            synchronized (baozi){
                if(!baozi.state){
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //被唤醒之后执行的代码，吃包子
                System.out.println("正在吃"+baozi.pi+baozi.xian+"包子...");
                //设置包子状态
                baozi.state=false;
                //通知生产着线程，开始生成包子了
                baozi.notify();
                System.out.println("吃货已经把包子吃完了，生产者开始消费包子了");
                System.out.println("------------------------------");
            }
        }
    }
}
