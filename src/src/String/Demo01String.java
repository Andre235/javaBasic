package String;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author : 赵静超
 * @date : 2019/9/30 13:48
 * @description : 字符串比较
 *                ==是对字符串进行地址值比较，equals()是对内容进行比较
 *                如果一个常量一个变量进行比较，建议将变量写在括号里面  "abc".equals(str1) 否则可能会抛出空指针异常
 *                忽略大小写进行内容比较 strA.equalsIgnoreCase(stra)
 */
@SuppressWarnings("all")
public class Demo01String {
    public static void main(String[] args) {
        //funcEquals();
        //funcGet();
        //funcSubString();
        //funcReplace();
        //funcSplice();
        //demo();
        lastIndexOfFun();

    }

    /**
     * 案例：键盘输入一个字符串，统计其大写字母个数、小写字母个数、数字个数、其他字符个数
     */
    private static void demo() {
        int countUpper=0;
        int countLower=0;
        int countNum=0;
        int countOthers=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = scanner.next();
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if('A' <= c && c <='Z'){
                countUpper++;
            }else if('a' <= c && c <='z'){
                countLower++;
            }else if('0'<= c && c <='9'){
                countNum++;
            }else{
                countOthers++;
            }
        }
        System.out.println("大写字母的个数是："+countUpper);
        System.out.println("小写字母的个数是："+countLower);
        System.out.println("数字的个数是："+countNum);
        System.out.println("其他字符的个数是："+countOthers);
    }


    /**
     * 字符串比较的相关方法
     */
    private static void funcEquals() {
        String str1= "hello";
        String str2= "hello";
        char[] charArray= {'h','e','l','l','o'};
        String str3 = new String(charArray);

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println("hello".equals(str3));

        System.out.println(str1==str2);
        System.out.println(str1==str3);

        System.out.println("________忽略大小写进行内容比较_________");
        String strA= "java";
        String stra= "JAVA";
        System.out.println(strA.equals(stra));
        System.out.println(strA.equalsIgnoreCase(stra));
    }

    /**
     * 字符串获取相关方法
     */
    private static void funcGet() {
        String str = "hello java";
        System.out.println("字符串长度为:"+str.length());

        String str2 = " engineer";
        System.out.println("拼接后的字符串为:"+str.concat(str2));

        System.out.println("指定索引位置的字符为:"+str.charAt(7));

        int index = str.indexOf("ava");
        System.out.println("查找传入字符串在当前字符串首次出现的索引位置:"+index);
    }

    /**
     * 截取字符串
     * public String substring (int index)
     * public String substring (int begin,int end)  参数左闭右开
     */
    private static void funcSubString() {
        String greet = "hello world";
        String str1 = greet.substring(4);
        System.out.println(str1);
        String str2 = greet.substring(4,8);
        System.out.println(str2);
    }

    /**
     * 字符串常用替换方法
     */
    private static void funcReplace() {
        char[] chars = "abc".toCharArray();
        for (char c : chars) {
            System.out.println(c);
        }

        byte[] bytes = "abc".getBytes();
        for (byte b : bytes) {
            System.out.println(b);
        }

        //字符串替换，可以用作敏感词过滤
        String greet = "how do you do?";
        String replace = greet.replace("o", "*");
        System.out.println(greet);
        System.out.println(replace);
    }

    /**
     * 字符串切割方法
     */
    private static void funcSplice() {
        String temp = "aaa,bb,c";
        String[] split = temp.split(",");
        for (String s : split) {
            System.out.println(s);
        }
    }

    private static void lastIndexOfFun() {
        String fileName = "188523.png";
        Integer index = fileName.lastIndexOf(".");
        System.out.println(index);
        String substring = fileName.substring(index);
        System.out.println(substring);
    }


}
