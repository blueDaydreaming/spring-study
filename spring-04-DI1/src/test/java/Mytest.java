import com.blue.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    public static void main (String[] args){
        ApplicationContext context1 =new  ClassPathXmlApplicationContext("beans.xml");
        Student student1=(Student)context1.getBean("student");
        System.out.println(student1.toString());
    }
}
