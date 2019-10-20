package MultipleThread.demo04InnerClassThread;

/**
 * @author : 赵静超
 * @date Date : 2019/10/20 19:29
 * @description : 创建匿名内部类来实现多线程
 */
public class TestThread {
    public static void main(String[] args) {

        //创建Thread匿名内部类
        /*new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName()+i);
                }
            }
        }.start();*/


        //匿名函数代替匿名内部类来创建多线程任务
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName()+i);
            }
        }).start();

        //实现Runable接口来实现多线程操作
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName() + i);
                }
            }
        }).start();
    }
}
