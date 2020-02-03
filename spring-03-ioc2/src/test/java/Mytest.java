import com.blue.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main (String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User u12 = (User) context.getBean("u33");
        u12.show();


    }
}
