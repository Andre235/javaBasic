package MultipleThread.demo05ThreadSafe;

/**
 * @author : 赵静超
 * @date Date : 2019/10/20 19:45
 * @description :
 */
public class ThreadSafe implements Runnable{
    private int ticket=100;
    @Override
    public void run() {
        while (true){
            if(ticket>0){
                //优化程序，提高程序安全问题出现的概率
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"正在售卖第"+ticket+"张票");
                ticket--;
            }
        }
    }
}
