package Generics泛型;

/**
 * @author : 赵静超
 * @date Date : 2019/9/14 15:35
 * @description : 1、泛型方法，在调用时可以接受不同类型的参数
 *                2、泛型的类型参数声明部分只能在方法的返回类型之前
 *                3、泛型方法的类型参数只能是引用型类型，不能是原始类型（比如int double char）
 */
public class demo {

    public static void main(String[] args) {
        //创建不同的类型数组
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5};
        Character[] charArray = {'H','E','L','L','O'};

        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);

        System.out.printf( "%d, %d 和 %d 中最大的数为 %d\n\n",
                3, 4, 5, getMaximum( 3, 4, 5 ) );
        System.out.printf( "%.1f, %.1f 和 %.1f 中最大的数为 %.1f\n\n",
                6.6, 8.8, 7.7, getMaximum( 6.6, 8.8, 7.7 ) );
        System.out.printf( "%s, %s 和 %s 中最大的数为 %s\n","pear",
                "apple", "orange", getMaximum( "pear", "apple", "orange" ) );
    }

    /**
     * 泛型方法
     * @param inputArray
     * @param <E>
     */
    private static <E> void printArray(E[] inputArray){
        for(E element:inputArray){
            System.out.print(element+" ");
        }
        System.out.println("\n");
    }

    /**
     * 泛型方法
     * 有界的类型参数
     * @param <T>
     * @return
     */
    private static <T extends Comparable<T>> T getMaximum(T x,T y,T z){
        //假设X为最大值
        T max = x;
        if(y.compareTo(max)>0){
            return y;
        }
        if(z.compareTo(max)>0){
            return z;
        }
        return max;
    }
}
