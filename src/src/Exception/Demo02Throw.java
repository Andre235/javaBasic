package Exception;

import java.util.Objects;

/**
 * @author : 赵静超
 * @date Date : 2019/10/20 11:35
 * @description : throw关键字，自己指定抛出异常类型
 */
public class Demo02Throw {
    public static void main(String[] args) {
        int[] arr = new int[3];
        try {
            int element = getElement(arr, 3);
            System.out.println(element);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
        nonNull(null);
        System.out.println("main方法执行结束......");
    }

    /**
     * 进行参数校验
     * 使用throw关键字指定抛出异常类型
     * @param arr
     * @param index
     * @return
     */
    public static int getElement(int[] arr, int index){
        if(arr==null){
            throw new NullPointerException("arr数组为空！");
        }
        if(index<0 || index>arr.length-1){
            throw new ArrayIndexOutOfBoundsException("参数数组越界！");
        }
        return arr[index];
    }

    public static void nonNull(String a){
        Objects.requireNonNull(a,"参数不能为空！");
        System.out.println(a);
    }
}
