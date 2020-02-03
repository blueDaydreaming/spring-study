import com.blue.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main (String[] args){
        //获取上下文
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //我们的对象
        Hello hello1 = (Hello) context.getBean("hello");
        hello1.show();
    }
}
