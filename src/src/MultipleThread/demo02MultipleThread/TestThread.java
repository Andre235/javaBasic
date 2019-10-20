package MultipleThread.demo02MultipleThread;

/**
 * @author : 赵静超
 * @date Date : 2019/10/20 17:13
 * @description :
 */
public class TestThread {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        //设置线程名称
        myThread.setName("thread_test");
        myThread.start();
        new MyThread().start();

        funcSleep();
    }

    /**
     * 测试Thread类的sleep方法
     * sleep()为静态方法，直接通过类名调用即可
     */
    private static void funcSleep() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(600);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }




}
