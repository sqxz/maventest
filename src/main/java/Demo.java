import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Field;

/**
 * @ClassName Demo
 * @Description TDD
 * @Author shenzhenghuan
 * @Date 2020/2/20 15:17
 **/
public class Demo {
    final static Logger logger = LogManager.getLogger(Demo.class);//用final修饰field可以阻止被重新赋值

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Demo demo = new Demo();
        int a = demo.getTax(new SalaryTax(),1000);
        int b = demo.getTax(new OtherTax(),1000);
        logger.info(a);
        logger.info(b);
        demo.reflectionTest();
        reflectionGetFiled();
    }


    public Integer getTax(Tax tax,int income){
        return tax.getTax(income);
    }

    public void  reflectionTest(){ //每加载一种class，JVM就为其创建一个Class类型的实例
        String a = "cba";
        String b = "abc";
        boolean test1 = (a.getClass()==b.getClass());
        logger.info(test1);
    }

    public static void  reflectionGetFiled() throws NoSuchFieldException, IllegalAccessException {
        Student student = new Student("shen","111111");
        Field field = Student.class.getDeclaredField("name");
        field.setAccessible(true);
        field.get(student);
        logger.info(field);
        logger.info(field.get(student));
    }

}
