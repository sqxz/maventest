package springstudy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springstudy.Bean.Student;
import springstudy.Bean.User;
import springstudy.dao.UserDaoMysqlImpl;
import springstudy.service.UserService;
import springstudy.service.UserServiceImpl;

public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userService = (UserServiceImpl) context.getBean("userServiceImpl");
        userService.getUser();

        Student student = context.getBean("student", Student.class);
        student.getCat().shout();
        student.getDog().shout();

    }
}
