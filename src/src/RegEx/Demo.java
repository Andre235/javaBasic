package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author : 赵静超
 * @date Date : 2019/9/26 21:39
 * @description : 正则表达式demo
 */
@SuppressWarnings("all")
public class Demo {

    public static void main(String[] args) {
        /*demo1();
        demo2();
        demo3();*/
        checkQQ("3134110000000000");
        funcGroup();
    }

    /**
     * 校验QQ号，位数5-15位，且不能是0开头的整数
     */
    private static void checkQQ(String qq) {
        String regEx="[1-9][0-9]{4,14}";
        System.out.println(qq.matches(regEx)?"合法":"非法");
    }

    /**
     * group()方法的使用
     * 根据()进行分组：分嵌套括号和不嵌套括号
     */
    private static void funcGroup() {
        String line = "This order was placed for QT3000! OK?";
        String regEx = "(\\D*)(\\d+)(.*)";

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()){
            System.out.println("分组个数共有:"+matcher.groupCount());
            System.out.println(matcher.group(0));
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
            System.out.println(matcher.group(3));
        }
    }

    /**
     * 索引方法：索引方法提供了精确的索引值，提供了在哪个索引出可以匹配到
     * matcher.start()
     * matcher.start()
     */
    private static void demo1() {
        String RegEx="\\bcat\\b";
        String matcheString= "cat cat cat cattie cat";
        Pattern pattern = Pattern.compile(RegEx);
        Matcher matcher = pattern.matcher(matcheString);
        int count=0;

        while (matcher.find()){
            count++;
            System.out.println("匹配次数："+count);
            System.out.println("matcher.start:"+matcher.start());
            System.out.println("matcher.end:"+matcher.start());
        }
    }

    /**
     * 研究方法：用于检查输入字符串，并返回一个布尔类型
     * matches方法要求正则表达式完全匹配整个字符串，lookingAt则没有要求，两个方法都返回boolean类型
     * 但是lookAt要求从第一个字符开始匹配
     */
    private static void demo2() {
        String regEx="foo";
        String input1="foooooooooooo";
        String input2="oooofoooooooo";

        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher1 = pattern.matcher(input1);
        Matcher matcher2 = pattern.matcher(input2);

        System.out.println("matcher.matches()"+matcher1.matches());     //matches()要求匹配整个序列，返回false
        System.out.println("matcher.lookingAt()"+matcher1.lookingAt()); //lookingAt()不需要匹配整个字符串，返回true
        System.out.println("matcher.lookingAt()"+matcher2.lookingAt()); //lookingAt()必须从头开始匹配，返回false

    }

    /**
     * 替换方法：匹配成功后replaceFirst()替换第一个，replaceAll()替换全部
     */
    private static void demo3() {
        String regEx="dog";
        String input="The dog says meow. All dogs say meow.";
        String replace="cat";

        System.out.println("全部替换前："+input);
        Pattern pattern = Pattern.compile(regEx);
        Matcher matcher = pattern.matcher(input);
        input=matcher.replaceAll(replace);
        System.out.println("全部替换后："+input);
    }



}
