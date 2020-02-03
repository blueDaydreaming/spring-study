import com.blue.dao.UserDaoMysqlImpl;
import com.blue.service.UserService;
import com.blue.service.UserServiecImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main (String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiecImpl service1=(UserServiecImpl)context.getBean("service1");
        service1.getUser();
//        System.out.println();
    }
}
