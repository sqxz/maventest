#Spring 学习
```java
package springstudy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springstudy.Bean.User;
import springstudy.dao.UserDaoMysqlImpl;
import springstudy.service.UserService;
import springstudy.service.UserServiceImpl;

public class SpringTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userService = (UserServiceImpl) context.getBean("userServiceImpl");
        userService.getUser();

        User user = (User) context.getBean("user");
        User user1 = (User) context.getBean("user");
        System.out.println(user == user1);
    }
}
```
##spring xml注入的学习
- bean注入
- property
- 构造方法注入
- set方法注入
