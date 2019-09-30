package Random;

import java.util.Random;
import java.util.Scanner;

/**
 * @author : 赵静超
 * @date : 2019/9/30 10:07
 * @description :
 */
public class RandomDemo {
    public static void main(String[] args) {
        //func1();
        guessNum();
    }

    private static void func1() {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int result=random.nextInt(10)+1;
            System.out.println(result);
        }
    }

    /**
     * 猜数字小游戏
     */
    private static void guessNum(){
        Random random = new Random();
        int result = random.nextInt(100)+1;
        Scanner scanner = new Scanner(System.in);
        int count=1;
        while (true){
            System.out.println("请输入您要猜测的数字:");
            int num = scanner.nextInt();
            if(num>result){
                System.out.println("猜大了");
            }else if(num<result){
                System.out.println("猜小了");
            }else{
                System.out.println("猜对了");
                break;
            }
            count++;
        }

        System.out.printf("游戏结束,你一共猜测了%d次",count);
    }

}
