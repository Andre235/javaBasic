package MultipleThread.demo01SingleThread;

/**
 * @author : 赵静超
 * @date Date : 2019/10/20 16:48
 * @description :
 */
public class Person {
    private String name;

    public void run(){
        for (int i = 0; i < 6; i++) {
            System.out.println(name+"-->"+i);
        }
    }

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
