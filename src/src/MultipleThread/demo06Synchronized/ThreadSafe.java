package MultipleThread.demo06Synchronized;

/**
 * @author : 赵静超
 * @date Date : 2019/10/20 19:45
 * @description :
 */
public class ThreadSafe implements Runnable{

    private int ticket=100;
    //创建一个锁对象 (锁对象可以是任意的对象)
    private final Object obj = new Object();

    @Override
    public void run() {
        while (true){
            //创建同步代码块
            /*
            synchronized (obj){
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
            }*/

            saleTicket();
        }
    }


    /**
     * 创建同步方法
     */
    public synchronized void saleTicket(){
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
    }
}
