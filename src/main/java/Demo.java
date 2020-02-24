import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName Demo
 * @Description TDD
 * @Author shenzhenghuan
 * @Date 2020/2/20 15:17
 **/
public class Demo {

    final static Logger logger = LogManager.getLogger(Demo.class);//用final修饰field可以阻止被重新赋值

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
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

    public static void  reflectionGetFiled() throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Student student = new Student("shen","111111",99);
        Field field = Student.class.getDeclaredField("name");
        field.setAccessible(true);
        field.get(student);
        logger.info(field);
        logger.info(field.get(student));
        Method method = student.getClass().getDeclaredMethod("getScore");
        logger.info(method);
        Method method1 = student.getClass().getDeclaredMethod("getLevel",String.class); //获取有参数的方法
        logger.info(method1);
        String level = (String) method1.invoke(student,"优秀"); //用反射的方法调用方法
        logger.info(level);
        Method method2 = student.getClass().getDeclaredMethod("getGrade");
        String grade = (String) method2.invoke(null,null);//调用静态方法时，由于无需指定实例对象，所以invoke方法传入的第一个参数永远为null
        logger.info(grade);
    }

}
