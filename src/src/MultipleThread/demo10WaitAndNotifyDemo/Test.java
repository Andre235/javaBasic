package MultipleThread.demo10WaitAndNotifyDemo;

import annotation.Pro;

/**
 * @author : 赵静超
 * @date Date : 2019/10/21 22:48
 * @description :
 */
public class Test {
    public static void main(String[] args) {
        Baozi baozi = new Baozi();
        //创建吃货线程
        new Consumer(baozi).start();
        //创建包子铺线程
        new Productor(baozi).start();
    }


}
