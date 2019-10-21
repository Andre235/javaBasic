package MultipleThread.demo10WaitAndNotifyDemo;

/**
 * @author : 赵静超
 * @date Date : 2019/10/21 21:35
 * 生产者线程：
 *      任务：生产包子
 *      对状态进行判断：
 * 	        true:有包子则调用wait（）
 * 	        false:无包子则生产包子
 * 		生产完之后，将状态改为false，唤醒吃货线程开始吃包子
 * 注意事项：
 *     1、必须使用同步技术保证线程安全问题
 *     2、锁对象必须唯一
 */
@SuppressWarnings("all")
public class Productor extends Thread {

    private Baozi baozi;

    public Productor(Baozi baozi) {
        this.baozi = baozi;
    }

    @Override
    public void run() {
        int count=0;
        //让包子铺生产包子
        while(true){
            //传递baozi锁对象
            synchronized (baozi){
                if(baozi.state==true){
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                //被唤醒之后，包子铺交替生产两种包子
                if(count%2==0){
                    baozi.pi="厚皮";
                    baozi.xian="猪肉";
                }else{
                    baozi.pi="薄皮";
                    baozi.xian="人肉";
                }
                count++;
                System.out.println("正在生产"+baozi.pi+baozi.xian+"包子...");

                //生产过长耗时3秒
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //重新设置包子状态
                baozi.state=true;
                //唤醒吃货线程
                baozi.notify();
                //唤醒吃货线程可以吃包子了
                System.out.println(baozi.pi+baozi.xian+"包子生产完成,吃货们可以开吃了");
            }
        }
    }
}
